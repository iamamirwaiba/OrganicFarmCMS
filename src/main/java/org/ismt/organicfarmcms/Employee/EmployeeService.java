package org.ismt.organicfarmcms.Employee;

import org.ismt.organicfarmcms.Employee.Employee;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Map;

public interface EmployeeService {
    String addEmployee(@RequestBody Map<String, Object> data) throws Exception;
    String editEmployee(int id,@RequestBody Map<String, Object> data) throws Exception;
    String deleteEmployee(int id) throws Exception;
    Employee getEmployee(int id) throws Exception;
    List<Employee> getAllEmployee() throws Exception;


}
