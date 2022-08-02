package org.ismt.organicfarmcms.TestUser

import org.ismt.organicfarmcms.Department.DepartmentService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.ComponentScan
import org.ismt.organicfarmcms.Department.Department
import org.springframework.http.{HttpStatus, ResponseEntity}
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation._

@Controller
@ComponentScan
class TestUserController {

  @Autowired
  var departmentService:DepartmentService = _

//  @GetMapping(path =Array("/api/v1/get-all-user"))
//  def getAllUser: ResponseEntity[java.util.List[TestUser]]={
//    new ResponseEntity[java.util.List[TestUser]](testUserService.getAllUser,HttpStatus.OK)
//
//  }
  @GetMapping(path = Array("/api/v1/test-get-all-department"))
  def getAllDepartment:ResponseEntity[java.util.List[Department]]=
    new ResponseEntity[java.util.List[Department]](departmentService.getAllDepartment,HttpStatus.OK)

}
