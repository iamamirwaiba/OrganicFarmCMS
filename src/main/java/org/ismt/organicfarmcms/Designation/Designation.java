package org.ismt.organicfarmcms.Designation;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="designation")
public class Designation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="name")
    private String name;
    @Column(name="department_id")
    private int departmentId;
    @Column(name="designation_code")
    private String designationCode;

    Designation(String name, int departmentId,String designationCode){
        this.name=name;
        this.departmentId=departmentId;
        this.designationCode=designationCode;
    }

}
