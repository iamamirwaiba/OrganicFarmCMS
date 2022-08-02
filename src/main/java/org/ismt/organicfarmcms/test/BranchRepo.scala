package org.ismt.organicfarmcms.test

import org.ismt.organicfarmcms.Department.Department
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository


trait BranchRepo extends JpaRepository[Department,java.lang.Integer] {
  
}
