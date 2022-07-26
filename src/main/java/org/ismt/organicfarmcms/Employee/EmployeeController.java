package org.ismt.organicfarmcms.Employee;

import lombok.RequiredArgsConstructor;
import org.ismt.organicfarmcms.Employee.Employee;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Map;


@Controller
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;

    @PostMapping("/api/v1/add-employee")
    ResponseEntity<String> addEmployee(@RequestBody Map<String, Object> data) throws Exception{
        return new ResponseEntity<>(employeeService.addEmployee(data), HttpStatus.OK);

    }

    @PostMapping("/api/v1/edit-employee/{id}")
    ResponseEntity<String> editEmployee(@PathVariable int id, @RequestBody Map<String, Object> data) throws Exception{
        return new ResponseEntity<>(employeeService.editEmployee(id,data),HttpStatus.OK);

    }

    @PostMapping("/api/v1/delete-employee/{id}")
    ResponseEntity<String> deleteEmployee(@PathVariable int id) throws Exception{
        return new ResponseEntity<>(employeeService.deleteEmployee(id),HttpStatus.OK);

    }

    @GetMapping("/api/v1/get-employee/{id}")
    ResponseEntity<Employee> getEmployee(@PathVariable int id) throws Exception{
        return new ResponseEntity<>(employeeService.getEmployee(id),HttpStatus.OK);

    }

    @GetMapping("/api/v1/get-all-employee")
    ResponseEntity<List<Employee>> getAllEmployee() throws Exception{
        return new ResponseEntity<>(employeeService.getAllEmployee(),HttpStatus.OK);
    }
}
