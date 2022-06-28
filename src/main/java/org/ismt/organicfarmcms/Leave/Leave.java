package org.ismt.organicfarmcms.Leave;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="leave")
public class Leave {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="leave_type")
    private String leaveType;
    @Column(name="leave_from")
    private String leaveFrom;
    @Column(name="leave_to")
    private String leaveTo;
    @Column(name="total_leave")
    private int totalLeave;
    @Column(name="leave_left")
    private int leaveLeft;
    @Column(name="leave_days")
    private int LeaveDays;
    @Column(name="employee_id")
    private int employeeId;

    public Leave(String leaveType, String leaveFrom, String leaveTo, int totalLeave, int leaveLeft, int leaveDays, int employeeId) {
        this.leaveType = leaveType;
        this.leaveFrom = leaveFrom;
        this.leaveTo = leaveTo;
        this.totalLeave = totalLeave;
        this.leaveLeft = leaveLeft;
        LeaveDays = leaveDays;
        this.employeeId = employeeId;
    }
}
