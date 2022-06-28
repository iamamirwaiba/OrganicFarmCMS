package org.ismt.organicfarmcms.Department;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Getter
@Setter
@NoArgsConstructor @AllArgsConstructor
@Entity
@Table(name="department")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="name")
    private String name;
    @Column(name="department_code")
    private String departmentCode;
    @Column(name="department_location")
    private String departmentLocation;

    public Department(String name, String departmentCode, String departmentLocation) {
        this.name = name;
        this.departmentCode = departmentCode;
        this.departmentLocation = departmentLocation;
    }
}
