package org.ismt.organicfarmcms.Employee;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name="employee")
public class Employee{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "email")
    private String email;
    @Column(name = "address")
    private String address;
    @Column(name = "citizenship_number")
    private String citizenshipNumber;
    @Column(name = "marital_status")
    private String maritalStatus;
    @Column(name = "date_of_birth")
    private Date dateOfBirth;
    @Column(name = "children")
    private int children;
    @Column(name = "designation_id")
    private int designationId;
    @Column(name = "department_id")
    private int departmentId;

    public Employee(String name, String email, String address, String citizenshipNumber, String maritalStatus, Date dateOfBirth, int children, int designationId, int departmentId) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.citizenshipNumber = citizenshipNumber;
        this.maritalStatus = maritalStatus;
        this.dateOfBirth = dateOfBirth;
        this.children = children;
        this.designationId = designationId;
        this.departmentId = departmentId;
    }


}
