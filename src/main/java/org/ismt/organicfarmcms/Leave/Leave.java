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
    @Column(name="total_leave")
    private int totalLeave;

    @Column(name="designation_id")
    private int designationId;

    public Leave(int totalLeave, int designationId) {
        this.totalLeave = totalLeave;
        this.designationId=designationId;
    }
}
