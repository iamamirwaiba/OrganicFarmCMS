package org.ismt.organicfarmcms.TestUser

import lombok.{AllArgsConstructor, NoArgsConstructor}

import javax.persistence.*
import scala.beans.BeanProperty


@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="users")
class TestUser {

  @Id
  @BeanProperty
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="id")
  var id:Int= _

  @BeanProperty
  @Column(name="phone_number")
  var phoneNumber: String= _

  @BeanProperty
  @Column(name="password")
  var password: String =_

  @BeanProperty
  @Column(name="roles")
  var roles: String = _

  @BeanProperty
  @Column(name="emp_id")
  var empId: Int= _


}
