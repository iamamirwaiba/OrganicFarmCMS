package org.ismt.organicfarmcms.TestUser

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

import java.util

@Service
class TestUserServiceImpl extends TestUserService {

  @Autowired
  var testUserRepo: TestUserRepo = _
  override def getAllUser: util.List[TestUser] ={
    testUserRepo.findAll()
  }
}
