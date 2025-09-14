package com.day1.Ecommerce.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class ProductDto {

    @NotBlank(message = "name should not be blank")
    public String name;
    @NotBlank(message = "description should not be blank")
    public String description;
    @NotBlank(message = "price should not be blank")
    public String price;
    @NotNull(message = "stockQuantity should not be blank")
    public Integer stockQuantity;
    @NotNull(message = "category should not be blank")
    public String category;


}
