package com.day1.Ecommerce.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class UserDto {

    @NotBlank(message = "username could not be a blank")
    public String name;
    @NotBlank(message = "password should not be blank")
    public String password;
    @Email
    @NotBlank(message = "email should not be blank")
    public String email;
    @NotBlank(message = "phone number should not be blank")
    public String phone;
    @NotBlank(message = "role should not be blank")
    public String role;
}
