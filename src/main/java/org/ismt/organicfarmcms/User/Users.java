package org.ismt.organicfarmcms.User;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="users")
public class Users {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="phone_number")
    private String phoneNumber;
    @Column(name="password")
    private String password;

    @Column(name="roles")
    private String roles;

    @Column(name="emp_id")
    private int employee_id;

    public Users(String phoneNumber, String password, String roles, int employee_id) {
        this.phoneNumber=phoneNumber;
        this.password = password;
        this.roles=roles;
        this.employee_id=employee_id;
    }

}
