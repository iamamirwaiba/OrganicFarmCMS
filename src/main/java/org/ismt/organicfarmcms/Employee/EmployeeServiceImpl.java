package org.ismt.organicfarmcms.Employee;

import lombok.RequiredArgsConstructor;
import org.ismt.organicfarmcms.User.Users;
import org.ismt.organicfarmcms.User.UserService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;
import java.util.Map;


@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService{

    private final EmployeeRepo employeeRepo;

    private final UserService userService;

    private final PasswordEncoder passwordEncoder;


    @Override
    @Transactional
    public String addEmployee(Map<String, Object> data) throws Exception {
        String name= (String) data.get("name");
        String email= (String) data.get("email");
        String address= (String) data.get("address");
        String citizenshipNumebr= (String) data.get("citizenship_number");
        String matitalStatus= (String) data.get("marital_status");
        String dob= (String) data.get("dob");
        Date date=new Date(dob);
        int children= (Integer) data.get("children");
        int designationId= (Integer) data.get("designation_id");
        int departmentId= (Integer) data.get("depart_id");
        String phoneNumber= (String) data.get("phone_number");
        String password= (String) data.get("password");
        String encodedPassword=passwordEncoder.encode(password);
        String roles= (String) data.get("roles");

        try{
            Employee employee=new Employee(name,email,address,citizenshipNumebr,matitalStatus,date,children,designationId,departmentId);
            employeeRepo.save(employee);
            Users users =new Users(phoneNumber,encodedPassword,roles,employee.getId());
            userService.addUser(users);
            return "Employee Added Successfully";
        }

        catch (Exception e){
            throw new Exception("Employee failed to add");
        }
    }

    @Transactional
    @Override
    public String editEmployee(int id, Map<String, Object> data) throws Exception {
        String name= (String) data.get("name");
        String email= (String) data.get("email");
        String address= (String) data.get("address");
        String citizenshipNumebr= (String) data.get("citizenship_number");
        String matitalStatus= (String) data.get("marital_status");
        String dob= (String) data.get("dob");
        Date date=new Date(dob);
        int children= (Integer) data.get("children");
        try {
            employeeRepo.updateEmployee(id,name,email,address,citizenshipNumebr,matitalStatus,date,children);
            return "Employee Updated Successfully";
        }
        catch (Exception e){
            throw new Exception("Employee failed to update");
        }

    }

    @Override
    public String deleteEmployee(int id) throws Exception {
        try {
            employeeRepo.deleteById(id);
            return "Employee Deleted Successfully";
        }
        catch (Exception e){
            throw new Exception("Employee failed to delete");
        }
    }

    @Override
    public Employee getEmployee(int id) throws Exception {
        try {
            return employeeRepo.getEmployeeById(id);
        }
        catch (Exception e){
            throw new Exception("Failed to get Employee Detail");
        }
    }

    @Override
    public List<Employee> getAllEmployee() throws Exception {
        try {
            return employeeRepo.findAll();
        }
        catch (Exception e){
            throw new Exception("failed to get all employee details");
        }
    }
}
