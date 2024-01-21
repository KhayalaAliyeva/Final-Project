//package com.example.finalproject.service.Impl;
//
//import com.example.finalproject.repository.Impl.UserRepositoryImpl;
//import com.example.finalproject.service.UserService;
//import lombok.AllArgsConstructor;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//
//@Service
//@AllArgsConstructor
//public class UserServiceImpl implements UserService {
//   private final static String USER_NOT_FOUND_MSG="user with email %s not found";
//    private final UserRepositoryImpl userRepository;
//    @Override
//    public org.springframework.security.core.userdetails.UserDetails loadUserByUsername(String email)
//            throws UsernameNotFoundException {
//        return userRepository.findByEmail(email).orElseThrow(()->
//                new UsernameNotFoundException(String.format(USER_NOT_FOUND_MSG,email)));
//    }
//}
