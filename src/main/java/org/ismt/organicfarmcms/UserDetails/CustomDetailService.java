//package org.ismt.organicfarmcms.UserDetails;
//
//import lombok.RequiredArgsConstructor;
//import org.ismt.organicfarmcms.User.User;
//import org.ismt.organicfarmcms.User.UserRepo;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//import java.util.Optional;
//
//@RequiredArgsConstructor
//@Service
//public class CustomDetailService implements UserDetailsService {
//
//    private final UserRepo userRepo;
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        Optional<User> user=userRepo.findByPhoneNumber(username);
//        try{
//            return new User(user.get().getUsername(), user.get().getPassword(), user.get().getRoles());
//        }
//        catch (Exception e){
//            throw new UsernameNotFoundException("Username Password not found");
//        }
//
//    }
//}
