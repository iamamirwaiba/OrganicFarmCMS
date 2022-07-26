package org.ismt.organicfarmcms.User;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{

    private final UserRepo userRepo;
    @Override
    public String addUser(Users users) throws Exception {
        try {
            userRepo.save(users);
            return "Success";
        }
        catch (Exception e){
            throw new Exception("User Failed to add") ;
        }
    }

    @Override
    public String editUser(int id, Map<String, Object> data) throws Exception {
        return null;
    }

    @Override
    public String deleteUser(int id) throws Exception {
        return null;
    }

    @Override
    public Users getUser(int id) throws Exception {
        return null;
    }

    @Override
    public List<Users> getAllUser() throws Exception {
        return null;
    }
}
