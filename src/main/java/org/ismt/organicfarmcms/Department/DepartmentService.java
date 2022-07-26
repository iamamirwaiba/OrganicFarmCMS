package org.ismt.organicfarmcms.Department;

import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Map;

public interface DepartmentService {
    String addDepartment(@RequestBody Map<String, Object> data) throws Exception;
    String editDepartment(int id,@RequestBody Map<String, Object> data) throws Exception;
    String deleteDepartment(int id) throws Exception;
    Department getDepartment(int id) throws Exception;
    List<Department> getAllDepartment() throws Exception;
}
