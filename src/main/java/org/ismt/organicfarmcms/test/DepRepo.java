package org.ismt.organicfarmcms.test;

import org.ismt.organicfarmcms.Department.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepRepo extends JpaRepository<Department,Integer> {
    
}
