package org.ismt.organicfarmcms.Vacancy;

import java.util.List;

public interface VacancyService {
    String addVacancy();
    String editVacancy(int id,Vacancy vacancy);
    String deleteVacancy(int id);
    Vacancy getVacancy(int id);
    List<Vacancy> getAllVacancy();

}
