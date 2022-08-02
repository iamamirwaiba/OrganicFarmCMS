package org.ismt.organicfarmcms.EmployeeLeave;

import org.ismt.organicfarmcms.Employee.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface EmployeeLeaveRepo extends JpaRepository<EmployeeLeave,Integer> {

    @Modifying
    @Query("update EmployeeLeave u set u.employeeId= :employeeId,u.leaveFrom= :leaveFrom,u.leaveTo= :leaveTo,u.leaveDays= :leaveDays where u.id= :id")
    void updateEmployee(int id,@Param("employeeId") int employeeId,@Param("leaveFrom") Date leaveFrom,@Param("leaveTo") Date leaveTo,@Param("leaveDays") int leaveDays);

    List<EmployeeLeave> getEmployeeLeaveByEmployeeId(int id);

}
