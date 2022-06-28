package org.ismt.organicfarmcms.Employee;

import lombok.*;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name="employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "phone_number")
    private Long phoneNumber;
    @Column(name = "email")
    private String email;
    @Column(name = "address")
    private String address;
    @Column(name = "citizenship_number")
    private String citizenshipNumber;
    @Column(name = "marital_status")
    private String maritalStatus;
    @Column(name = "date_of_birth")
    private String dateOfBirth;
    @Column(name = "children")
    private String children;
    @Column(name = "designation_id")
    private String designationId;
    @Column(name = "department_id")
    private String departmentId;
    @Column(name = "username")
    private String username;
    @Column(name = "password")
    private String password;
    @Column(name = "role")
    private String role;

    public Employee(String name, Long phoneNumber, String email, String address, String citizenshipNumber, String maritalStatus, String dateOfBirth, String children, String designationId, String departmentId, String username, String password, String role) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
        this.citizenshipNumber = citizenshipNumber;
        this.maritalStatus = maritalStatus;
        this.dateOfBirth = dateOfBirth;
        this.children = children;
        this.designationId = designationId;
        this.departmentId = departmentId;
        this.username = username;
        this.password = password;
        this.role = role;
    }
}
