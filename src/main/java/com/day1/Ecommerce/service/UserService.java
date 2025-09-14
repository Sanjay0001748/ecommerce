package com.day1.Ecommerce.service;

import com.day1.Ecommerce.models.Users;
import com.day1.Ecommerce.repository.UserRepo;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {


    private UserRepo userRepo;

    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public ResponseEntity<?> saveUser(Users users) throws Exception {

        Optional<Users> userObj=userRepo.findByphone(users.getPhone());
        if(userObj.isEmpty())
        {
            userRepo.save(users);
        }
        else
        {
            return ResponseEntity.ok("user is already exist please, login");
        }

        return ResponseEntity.ok("user registered successfully");
    }
}
