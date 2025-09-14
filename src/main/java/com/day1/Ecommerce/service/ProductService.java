package com.day1.Ecommerce.service;

import com.day1.Ecommerce.models.Product;
import com.day1.Ecommerce.repository.ProductRepo;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class ProductService {

    private ProductRepo productRepo;

    public ProductService(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    public ResponseEntity<?> saveProduct(Product product) {
        productRepo.save(product);
        HashMap<String,Object> response=new HashMap<>();
        response.put("success",true);
        response.put("msg","product  has been added");

        return ResponseEntity.ok(response);
    }
}
