package org.ismt.organicfarmcms.EmployeeLeave;

import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Map;

public interface EmployeeLeaveService {

    String addEmployeeLeave(@RequestBody Map<String, Object> data) throws Exception;
    String editEmployeeLeave(int id,@RequestBody Map<String, Object> data) throws Exception;
    String deleteEmployeeLeave(int id) throws Exception;
    List<EmployeeLeave> getEmployeeLeave(int id) throws Exception;
    List<EmployeeLeave> getAllEmployeeLeave() throws Exception;
}

