package com.day1.Ecommerce.controller;

import com.day1.Ecommerce.dtos.UserDto;
import com.day1.Ecommerce.models.Users;
import com.day1.Ecommerce.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/api/user")
@Tag(name = "user related apis",description = "apis to manage users related features")
public class UsersController {
    private UserService userService;
    public UsersController(UserService userService) {
        this.userService = userService;
    }


    @Operation(summary = "new users registeration",description = "first time users register to the application using this api ")
    @PostMapping("/register")
    public ResponseEntity<?> registerUser(@RequestBody @Valid UserDto userDto) throws Exception {
        Users users=new Users();
        users.setName(userDto.getName());
        users.setPassword(userDto.getPassword());
        users.setEmail(userDto.getEmail());
        users.setRole(userDto.getRole());
        users.setPhone(userDto.getPhone());
        users.setCreatedAt(LocalDateTime.now());
        return userService.saveUser(users);
    }

}
