package org.ismt.organicfarmcms.Designation;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface DesignationRepo extends JpaRepository<Designation,Integer> {
    @Modifying
    @Query("update Designation u set u.name= :dName,u.designationCode= :dCode,u.departmentId= :departCode where u.id= :id")
    void updateDName(int id, @Param("dName") String dName, @Param("dCode") int dCode, @Param("departCode") String departCode);

    Designation getDesignationById(int id);

}
