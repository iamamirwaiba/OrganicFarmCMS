package org.ismt.organicfarmcms.Leave;

import org.ismt.organicfarmcms.Leave.Leave;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Map;

public interface LeaveService {
    String addLeave(@RequestBody Map<String, Object> data) throws Exception;
    String editLeave(int id,@RequestBody Map<String, Object> data) throws Exception;
    String deleteLeave(int id) throws Exception;
    Leave getLeave(int id) throws Exception;
    Leave getLeaveByDesignationId(int dId) throws Exception;
    List<Leave> getAllLeave() throws Exception;

}
