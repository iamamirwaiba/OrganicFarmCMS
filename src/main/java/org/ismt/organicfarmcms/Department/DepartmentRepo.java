package org.ismt.organicfarmcms.Department;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepo extends JpaRepository<Department,Integer> {

    @Modifying
    @Query("update Department u set u.name= :dName,u.departmentCode= :dCode,u.departmentLocation= :dLocation where u.id= :id")
    void updateDName(int id,@Param("dName") String dName,@Param("dCode") String dCode,@Param("dLocation") String dLocation);

    Department getDepartmentById(int id);

}
