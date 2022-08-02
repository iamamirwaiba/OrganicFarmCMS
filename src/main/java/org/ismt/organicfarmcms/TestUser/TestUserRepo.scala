package org.ismt.organicfarmcms.TestUser

import org.springframework.data.jpa.repository.JpaRepository

trait TestUserRepo extends JpaRepository[TestUser ,Int ]{

}
