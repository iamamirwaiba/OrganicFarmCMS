package org.ismt.organicfarmcms.Leave;

import lombok.RequiredArgsConstructor;
import org.ismt.organicfarmcms.Leave.Leave;
import org.ismt.organicfarmcms.Leave.LeaveService;
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
public class LeaveController {

    private final LeaveService leaveService;

    @PostMapping("/api/v1/add-leave")
    ResponseEntity<String> addLeave(@RequestBody Map<String, Object> data) throws Exception{
        return new ResponseEntity<>(leaveService.addLeave(data), HttpStatus.OK);

    }

    @PostMapping("/api/v1/edit-leave/{id}")
    ResponseEntity<String> editLeave(@PathVariable int id, @RequestBody Map<String, Object> data) throws Exception{
        return new ResponseEntity<>(leaveService.editLeave(id,data),HttpStatus.OK);

    }

    @PostMapping("/api/v1/delete-leave/{id}")
    ResponseEntity<String> deleteLeave(@PathVariable int id) throws Exception{
        return new ResponseEntity<>(leaveService.deleteLeave(id),HttpStatus.OK);

    }

    @GetMapping("/api/v1/get-leave/{id}")
    ResponseEntity<Leave> getLeave(@PathVariable int id) throws Exception{
        return new ResponseEntity<>(leaveService.getLeave(id),HttpStatus.OK);

    }

    @GetMapping("/api/v1/get-all-leave")
    ResponseEntity<List<Leave>> getAllLeave() throws Exception{
        return new ResponseEntity<>(leaveService.getAllLeave(),HttpStatus.OK);
    }
}
