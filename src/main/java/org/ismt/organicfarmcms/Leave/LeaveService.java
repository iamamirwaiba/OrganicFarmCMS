package org.ismt.organicfarmcms.Leave;

import java.util.List;

public interface LeaveService {
    String addLeave();
    String editLeave(int id,Leave leave);
    String deleteLeave(int id);
    Leave getLeave(int id);
    List<Leave> getAllLeaves();

}
