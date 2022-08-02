package org.ismt.organicfarmcms.RemainingLeave;

public interface RemainingLeaveService {
    String addRemainingLeave(RemainingLeave remainingLeave) throws Exception;

    String updateRemainingLeave(int empid,int remainingLeave) throws  Exception;

    RemainingLeave getRemainingLeave(int empId) throws Exception;
}
