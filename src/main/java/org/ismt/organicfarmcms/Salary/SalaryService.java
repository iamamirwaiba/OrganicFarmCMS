package org.ismt.organicfarmcms.Salary;

import java.util.List;

public interface SalaryService {

    String addSalary();
    String editSalary(int id,Salary salary);
    String deleteSalary(int id);
    Salary getSalary(int id);
    List<Salary> getAllSalary(int id);


}
