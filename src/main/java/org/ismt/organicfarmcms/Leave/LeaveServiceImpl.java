package org.ismt.organicfarmcms.Leave;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Map;


@Service
@RequiredArgsConstructor
public class LeaveServiceImpl implements LeaveService{


    private final LeaveRepo leaveRepo;

    @Override
    public String addLeave(Map<String, Object> data) throws Exception {

        int designationId= (Integer) data.get("designation_id");
        int totalLeave=(Integer) data.get("total_leave");
        Leave leave=new Leave(totalLeave,designationId);
        try {
            leaveRepo.save(leave);
            return "leave saved successfully";
        }
        catch (Exception e){
            throw new Exception("failed to save leave");
        }
    }

    @Transactional
    @Override
    public String editLeave(int id, Map<String, Object> data) throws Exception {
        int designationId= (Integer) data.get("designation_id");
        int totalLeave=(Integer) data.get("total_leave");
        try {
            leaveRepo.updateLeave(id,designationId,totalLeave);
            return "leave Updated Successfully";
        }
        catch (Exception e){
            throw new Exception("failed to update Leave");
        }
    }

    @Override
    public String deleteLeave(int id) throws Exception {
        try {
            leaveRepo.deleteById(id);
            return "leave deleted successfully";
        }
        catch (Exception e){
            throw new Exception("leave failed to delete");
        }
    }

    @Override
    public Leave getLeave(int id) throws Exception {
        try {
            return leaveRepo.getLeaveById(id);
        }
        catch (Exception e){
            throw new Exception("failed to get leave");
        }
    }

    @Override
    public Leave getLeaveByDesignationId(int dId) throws Exception {
        try {
            return leaveRepo.getLeaveByDesignationId(dId);
        }
        catch (Exception e){
            throw new Exception("failed to get leave");
        }
    }

    @Override
    public List<Leave> getAllLeave() throws Exception {
        try {
            return leaveRepo.findAll();
        }
        catch (Exception e){
            throw new Exception("failed to get leaves");
        }
    }
}
