package org.ismt.organicfarmcms.EmployeeLeave;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="employee_leave")
public class EmployeeLeave {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="leave_from")
    private Date leaveFrom;
    @Column(name="leave_to")
    private Date leaveTo;
    @Column(name="employee_id")
    private int employeeId;
    @Column(name="leave_days")
    private int leaveDays;

    public EmployeeLeave(Date leaveFrom, Date leaveTo, int employeeId, int leaveDays) {
        this.leaveFrom = leaveFrom;
        this.leaveTo = leaveTo;
        this.employeeId = employeeId;
        this.leaveDays = leaveDays;
    }
}
