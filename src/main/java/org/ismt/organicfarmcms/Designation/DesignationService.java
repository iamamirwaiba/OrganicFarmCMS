package org.ismt.organicfarmcms.Designation;

import org.ismt.organicfarmcms.Designation.Designation;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Map;

public interface DesignationService {

    String addDesignation(@RequestBody Map<String, Object> data) throws Exception;
    String editDesignation(int id,@RequestBody Map<String, Object> data) throws Exception;
    String deleteDesignation(int id) throws Exception;
    Designation getDesignation(int id) throws Exception;
    List<Designation> getAllDesignation() throws Exception;
}
