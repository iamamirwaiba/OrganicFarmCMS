package org.ismt.organicfarmcms.Department;

import lombok.RequiredArgsConstructor;
import org.json.JSONObject;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Map;


@Service
@RequiredArgsConstructor
public class DepartmentServiceImpl implements DepartmentService{

    private final DepartmentRepo departmentRepo;

    @Override
    public String addDepartment(Map<String, Object> data) throws Exception {

        String dName= (String) data.get("d_name");
        String dCode=(String) data.get("d_code");
        String dLocation=(String) data.get("d_location");

        Department department=new Department(dName,dCode,dLocation);
        try{
            departmentRepo.save(department);
            return "Department Successfully Added";
        }
        catch (Exception e){
            throw  new Exception("Failed to add Department");
        }

    }

    @Override
    @Transactional
    public String editDepartment(int id,Map<String, Object> data) throws Exception {
        String dName= (String) data.get("d_name");
        String dCode=(String) data.get("d_code");
        String dLocation=(String) data.get("d_location");
        try {
            departmentRepo.updateDName(id, dName,dCode,dLocation);
            return "Department Updated Successfully";
        }
        catch (Exception e){
            throw new Exception("Failed TO update");
        }

    }

    @Override
    @Transactional
    public String deleteDepartment(int id) throws Exception {
        try {
            departmentRepo.deleteById(id);
            return "Deleted Successfully";
        }
        catch (Exception e){
            throw new Exception("Id not found exception");
        }
    }

    @Override
    public Department getDepartment(int id) throws Exception {
        try {
            return departmentRepo.getDepartmentById(id);
        }
        catch (Exception e){
            throw new Exception("Department not found exception");
        }
    }

    @Override
    public List<Department> getAllDepartment() throws Exception {
        try {
            return departmentRepo.findAll();
        }
        catch (Exception e){
            throw new Exception("Department Not found Exception");
        }
    }
}
