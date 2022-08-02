package org.ismt.organicfarmcms.RemainingLeave;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Controller;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="remaining_leave")
public class RemainingLeave {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="remaining_leave")
    private int remainingLeave;
    @Column(name="employee_id")
    private int employeeId;

    public RemainingLeave(int remainingLeave, int employeeId) {
        this.remainingLeave = remainingLeave;
        this.employeeId = employeeId;
    }
}
