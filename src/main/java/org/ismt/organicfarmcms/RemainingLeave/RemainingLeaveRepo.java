package org.ismt.organicfarmcms.RemainingLeave;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RemainingLeaveRepo extends JpaRepository<RemainingLeave,Integer> {


    @Modifying
    @Query("update RemainingLeave u set u.remainingLeave= :remainingLeave where u.employeeId= :employeeId")
    void updateRemainingLeave(@Param("employeeId") int employeeId, @Param("remainingLeave") int remainingLeave);

    RemainingLeave getRemainingLeaveByEmployeeId(int empId);

}