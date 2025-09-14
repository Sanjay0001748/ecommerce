package com.day1.Ecommerce.dtos;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class CategoryDto {

    @NotBlank(message = "category name should not be blank")
    public String name;
    @NotBlank(message = "category description should not be blank")
    public String description;
}
