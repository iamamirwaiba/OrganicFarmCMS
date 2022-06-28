package org.ismt.organicfarmcms.Salary;


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
@Table(name="salary")
public class Salary {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="amount")
    private int amount;
    @Column(name="designation_id")
    private int designationId;

    public Salary(int amount, int designationId) {
        this.amount = amount;
        this.designationId = designationId;
    }
}
