package org.ismt.organicfarmcms.Leave;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface LeaveRepo extends JpaRepository<Leave,Integer> {

    Leave getLeaveById(int id);

    @Modifying
    @Query("update Leave u set u.designationId= :designationId,u.totalLeave= :totalLeave where u.id= :id")
    void updateLeave(int id, @Param("designationId") int designationId, @Param("totalLeave") int totalLeave);

    Leave getLeaveByDesignationId(int dId);

}
