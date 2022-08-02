package org.ismt.organicfarmcms.RemainingLeave;

import liquibase.pro.packaged.E;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
public class RemainingLeaveServiceImpl implements RemainingLeaveService{

    private final RemainingLeaveRepo remainingLeaveRepo;
    @Override
    public String addRemainingLeave(RemainingLeave remainingLeave) throws Exception {
        try {
            remainingLeaveRepo.save(remainingLeave);
            return "remaing leave saved Successfully";
        }
        catch (Exception e){
            throw new Exception("failed to add remaining leave");
        }
    }

    @Transactional
    @Override
    public String updateRemainingLeave(int empId,int remainingLeave) throws Exception {
        try {
            remainingLeaveRepo.updateRemainingLeave(empId,remainingLeave);
            return "remaing leave saved Successfully";
        }
        catch (Exception e){
            throw new Exception("failed to add remaining leave");
        }
    }

    @Override
    public RemainingLeave getRemainingLeave(int empId) throws Exception {
        try{
            return remainingLeaveRepo.getRemainingLeaveByEmployeeId(empId);
        }
        catch (Exception e){
            throw new Exception("failed to get Remaining Leave");
        }
    }
}
