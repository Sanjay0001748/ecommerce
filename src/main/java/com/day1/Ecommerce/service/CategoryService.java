package com.day1.Ecommerce.service;

import com.day1.Ecommerce.dtos.ResponseDto;
import com.day1.Ecommerce.models.Category;
import com.day1.Ecommerce.repository.CategoryRepo;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class CategoryService {

    private CategoryRepo categoryRepo;

    public CategoryService(CategoryRepo categoryRepo) {
        this.categoryRepo = categoryRepo;
    }

    public ResponseEntity<?> saveCategory(Category category) {

        categoryRepo.save(category);
        HashMap<String,Object> response=new HashMap<>();
        response.put("success",true);
        response.put("msg","category has been added successfully");
        return ResponseEntity.ok(response);
    }
}
