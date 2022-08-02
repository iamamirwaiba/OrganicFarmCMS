package org.ismt.organicfarmcms.EmployeeLeave;

import lombok.RequiredArgsConstructor;
import org.ismt.organicfarmcms.Employee.Employee;
import org.ismt.organicfarmcms.Employee.EmployeeService;
import org.ismt.organicfarmcms.Leave.Leave;
import org.ismt.organicfarmcms.Leave.LeaveService;
import org.ismt.organicfarmcms.RemainingLeave.RemainingLeave;
import org.ismt.organicfarmcms.RemainingLeave.RemainingLeaveService;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class EmployeeLeaveServiceImpl implements EmployeeLeaveService{

    private final RemainingLeaveService remainingLeaveService;
    private final LeaveService leaveService;

    private final EmployeeService employeeService;
    private final EmployeeLeaveRepo employeeLeaveRepo;
    @Override
    @Transactional
    public String addEmployeeLeave(Map<String, Object> data) throws Exception {
        int total=0;
        String leaveFrom=(String) data.get("leave_from");
        String leaveTo=(String) data.get("leave_to");
        int empId=(Integer) data.get("employee_id");
        Date d1=new Date(leaveFrom);
        Date d2=new Date(leaveTo);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate fromDate=LocalDate.parse(leaveFrom,dtf);
        LocalDate toDate=LocalDate.parse(leaveTo,dtf);
        int daysBetween = (int) ChronoUnit.DAYS.between(fromDate, toDate);

        try {
            EmployeeLeave employeeLeave=new EmployeeLeave(d1,d2,empId,daysBetween);
            employeeLeaveRepo.save(employeeLeave);
            Employee employee=employeeService.getEmployee(empId);
            Leave leave=leaveService.getLeaveByDesignationId(employee.getDesignationId());
            if(employeeLeaveRepo.getEmployeeLeaveByEmployeeId(empId)!=null){
                List<EmployeeLeave> employeeLeaves=employeeLeaveRepo.getEmployeeLeaveByEmployeeId(empId);
                for (EmployeeLeave employeeLeave1: employeeLeaves) {
                    total+=employeeLeave1.getLeaveDays();
                }

            }
            remainingLeaveService.updateRemainingLeave(empId,leave.getTotalLeave()-total);
            return "Employee Leave Added Successfully";
        }
        catch (Exception e){
            throw new Exception("employee Leave failed to add");
        }
    }

    @Override
    public String editEmployeeLeave(int id, Map<String, Object> data) throws Exception {
        String leaveFrom=(String) data.get("leave_from");
        String leaveTo=(String) data.get("leave_to");
        int empId=(Integer) data.get("employee_id");
        Date fromDate=new Date(leaveFrom);
        Date toDate=new Date(leaveTo);
        int leaveDays= (int) Duration.between((Temporal) fromDate, (Temporal) toDate).toDays();

        try {
            employeeLeaveRepo.updateEmployee(id,empId,fromDate,toDate,leaveDays);
            return "Employeeleave Updated Successfully";
        }
        catch (Exception e){
            throw new Exception("employee Leave failed to update");
        }
    }

    @Override
    public String deleteEmployeeLeave(int id) throws Exception {
        try {
            employeeLeaveRepo.deleteById(id);
            return "Employee leave Deleted ";
        }
        catch (Exception e){
            throw new Exception("Employee failed to delete");
        }
    }

    @Override
    public List<EmployeeLeave> getEmployeeLeave(int id) throws Exception {
        try {
            return employeeLeaveRepo.getEmployeeLeaveByEmployeeId(id);
        }
        catch (Exception e){
            throw new Exception("Failed to get Employee");
        }
    }

    @Override
    public List<EmployeeLeave> getAllEmployeeLeave() throws Exception {
        try {
            return employeeLeaveRepo.findAll();
        }
        catch (Exception e){
            throw new Exception("Failed to get Employee");
        }
    }
}
