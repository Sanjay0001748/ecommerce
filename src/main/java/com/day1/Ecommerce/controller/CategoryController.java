package com.day1.Ecommerce.controller;

import com.day1.Ecommerce.dtos.CategoryDto;
import com.day1.Ecommerce.models.Category;
import com.day1.Ecommerce.service.CategoryService;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/category")
@Tag(name="category related api",description = "this api manages all features related to the category ")
public class CategoryController {

    private CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @PostMapping("/add")
    public ResponseEntity<?> addCategory(@RequestBody @Valid CategoryDto categoryDto)
    {
        Category category =new Category();
        category.setName(categoryDto.getName());
        category.setDescription(categoryDto.getDescription());
        return categoryService.saveCategory(category);
    }
}
