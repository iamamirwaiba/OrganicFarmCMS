package org.ismt.organicfarmcms.Vacancy;


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
@Table(name="vacancy")
public class Vacancy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="designation_id")
    private int designationId;
    @Column(name="no_of_vacancy")
    private int noOfVacancy;
    @Column(name="deadline")
    private String deadline;
    @Column(name="about_us")
    private String aboutUs;
    @Column(name="qualification_experience")
    private String Qualification;
    @Column(name="skills")
    private String skills;
    @Column(name="responsibility")
    private String responsibility;
    @Column(name="keynote")
    private String keynote;


    public Vacancy(int designationId, int noOfVacancy, String deadline, String aboutUs, String qualification, String skills, String responsibility, String keynote) {
        this.designationId = designationId;
        this.noOfVacancy = noOfVacancy;
        this.deadline = deadline;
        this.aboutUs = aboutUs;
        Qualification = qualification;
        this.skills = skills;
        this.responsibility = responsibility;
        this.keynote = keynote;
    }
}
