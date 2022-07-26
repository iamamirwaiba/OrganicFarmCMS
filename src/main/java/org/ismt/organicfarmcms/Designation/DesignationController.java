package org.ismt.organicfarmcms.Designation;

import lombok.RequiredArgsConstructor;
import org.ismt.organicfarmcms.Designation.Designation;
import org.ismt.organicfarmcms.Designation.DesignationService;
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
public class DesignationController {

    private final DesignationService designationService;

    @PostMapping("/api/v1/add-designation")
    ResponseEntity<String> addDesignation(@RequestBody Map<String, Object> data) throws Exception{
        return new ResponseEntity<>(designationService.addDesignation(data), HttpStatus.OK);

    }

    @PostMapping("/api/v1/edit-designation/{id}")
    ResponseEntity<String> editDesignation(@PathVariable int id, @RequestBody Map<String, Object> data) throws Exception{
        return new ResponseEntity<>(designationService.editDesignation(id,data),HttpStatus.OK);

    }

    @PostMapping("/api/v1/delete-designation/{id}")
    ResponseEntity<String> deleteDesignation(@PathVariable int id) throws Exception{
        return new ResponseEntity<>(designationService.deleteDesignation(id),HttpStatus.OK);

    }

    @GetMapping("/api/v1/get-designation/{id}")
    ResponseEntity<Designation> getDesignation(@PathVariable int id) throws Exception{
        return new ResponseEntity<>(designationService.getDesignation(id),HttpStatus.OK);

    }

    @GetMapping("/api/v1/get-all-designation")
    ResponseEntity<List<Designation>> getAllDesignation() throws Exception{
        return new ResponseEntity<>(designationService.getAllDesignation(),HttpStatus.OK);
    }
}
