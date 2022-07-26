package org.ismt.organicfarmcms.User;

import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Map;

public interface UserService {
    String addUser(Users users) throws Exception;
    String editUser(int id,@RequestBody Map<String, Object> data) throws Exception;
    String deleteUser(int id) throws Exception;
    Users getUser(int id) throws Exception;
    List<Users> getAllUser() throws Exception;
}
