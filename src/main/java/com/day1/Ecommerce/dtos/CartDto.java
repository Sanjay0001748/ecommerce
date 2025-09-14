package com.day1.Ecommerce.dtos;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class CartDto {

        @NotBlank(message = "user name should not be blank")
        public String phone;
}
