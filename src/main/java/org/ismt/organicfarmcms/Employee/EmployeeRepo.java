package org.ismt.organicfarmcms.Employee;

import org.ismt.organicfarmcms.Designation.Designation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Integer> {

    @Modifying
    @Query("update Employee u set u.name= :name,u.email= :email,u.address= :address,u.citizenshipNumber= :citizenship, u.maritalStatus= :maritalStatus, u.dateOfBirth= :date, u.children= :children where u.id= :id")
    void updateEmployee(int id, @Param("name") String name, @Param("email") String email, @Param("address") String address,@Param("citizenship") String citizenshipNumber,@Param("maritalStatus") String maritalStatus,@Param("date") Date date,@Param("children") int children);

    Employee getEmployeeById(int id);
}
