package org.ismt.organicfarmcms.Department;


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
public class DepartmentController {

    private final DepartmentService departmentService;


    @PostMapping("/api/v1/add-department")
    ResponseEntity<String> addDepartment(@RequestBody Map<String, Object> data) throws Exception{
        return new ResponseEntity<>(departmentService.addDepartment(data),HttpStatus.OK);

    }

    @PostMapping("/api/v1/edit-department/{id}")
    ResponseEntity<String> editDepartment(@PathVariable int id, @RequestBody Map<String, Object> data) throws Exception{
        return new ResponseEntity<>(departmentService.editDepartment(id,data),HttpStatus.OK);

    }

    @PostMapping("/api/v1/delete-department/{id}")
    ResponseEntity<String> deleteDepartment(@PathVariable int id) throws Exception{
        return new ResponseEntity<>(departmentService.deleteDepartment(id),HttpStatus.OK);

    }

    @GetMapping("/api/v1/get-department/{id}")
    ResponseEntity<Department> getDepartment(@PathVariable int id) throws Exception{
        return new ResponseEntity<>(departmentService.getDepartment(id),HttpStatus.OK);

    }

    @GetMapping("/api/v1/get-all-department")
    ResponseEntity<List<Department>> getAllDepartment() throws Exception{
        return new ResponseEntity<>(departmentService.getAllDepartment(),HttpStatus.OK);
    }

}
