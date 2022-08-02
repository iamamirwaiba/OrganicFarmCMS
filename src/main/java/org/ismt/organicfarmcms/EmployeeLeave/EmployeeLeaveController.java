package org.ismt.organicfarmcms.EmployeeLeave;


import lombok.RequiredArgsConstructor;
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
public class EmployeeLeaveController {

    private final EmployeeLeaveService employeeLeaveService;

    @PostMapping("/api/v1/add-employeeLeave")
    ResponseEntity<String> addEmployeeLeave(@RequestBody Map<String, Object> data) throws Exception{
        return new ResponseEntity<>(employeeLeaveService.addEmployeeLeave(data), HttpStatus.OK);

    }

    @PostMapping("/api/v1/edit-employeeLeave/{id}")
    ResponseEntity<String> editEmployeeLeave(@PathVariable int id, @RequestBody Map<String, Object> data) throws Exception{
        return new ResponseEntity<>(employeeLeaveService.editEmployeeLeave(id,data),HttpStatus.OK);

    }

    @PostMapping("/api/v1/delete-employeeLeave/{id}")
    ResponseEntity<String> deleteEmployeeLeave(@PathVariable int id) throws Exception{
        return new ResponseEntity<>(employeeLeaveService.deleteEmployeeLeave(id),HttpStatus.OK);

    }

    @GetMapping("/api/v1/get-employeeLeave/{id}")
    ResponseEntity<List<EmployeeLeave>> getEmployeeLeave(@PathVariable int id) throws Exception{
        return new ResponseEntity<>(employeeLeaveService.getEmployeeLeave(id),HttpStatus.OK);

    }

    @GetMapping("/api/v1/get-all-employeeLeave")
    ResponseEntity<List<EmployeeLeave>> getAllEmployeeLeave() throws Exception{
        return new ResponseEntity<>(employeeLeaveService.getAllEmployeeLeave(),HttpStatus.OK);
    }

}
