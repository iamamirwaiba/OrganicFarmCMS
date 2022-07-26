package org.ismt.organicfarmcms.Designation;

import liquibase.pro.packaged.E;
import lombok.RequiredArgsConstructor;
import org.ismt.organicfarmcms.Department.Department;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Map;


@Service
@RequiredArgsConstructor
public class DesignationServiceImpl implements DesignationService{

    private final DesignationRepo designationRepo;

    @Override
    public String addDesignation(Map<String, Object> data) throws Exception {
        String dName= (String) data.get("d_name");
        int departId=(Integer) data.get("depart_id");
        String designationCode=(String) data.get("designation_code");
        try {
            Designation designation=new Designation(dName,departId,designationCode);
            designationRepo.save(designation);
            return "Designation Added Successfully";
        }
        catch (Exception e){
            throw new Exception("Failed to add Designation");
        }

    }

    @Override
    @Transactional
    public String editDesignation(int id, Map<String, Object> data) throws Exception {
        String dName= (String) data.get("d_name");
        int dCode=(Integer) data.get("d_code");
        String departCode=(String) data.get("depart_code");
        try {
            designationRepo.updateDName(id,dName,dCode,departCode);
            return "Designation Updated Successfully";
        }
        catch (Exception e){
            throw new Exception("Designation failed to update");
        }


    }

    @Override
    public String deleteDesignation(int id) throws Exception {
        try {
            designationRepo.deleteById(id);
            return "Designation Deleted Successfully";
        }
        catch (Exception e){
            throw new Exception("Designation failed to delete");
        }
    }

    @Override
    public Designation getDesignation(int id) throws Exception {
        try {
            return designationRepo.getDesignationById(id);
        }
        catch (Exception e){
            throw new Exception("Failed to get Designation");
        }
    }

    @Override
    public List<Designation> getAllDesignation() throws Exception {
        try {
            return designationRepo.findAll();
        }
        catch (Exception e){
            throw new Exception("Failed to retrieve Designation");
        }
    }
}
