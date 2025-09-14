package com.day1.Ecommerce.controller;


import com.day1.Ecommerce.dtos.ProductDto;
import com.day1.Ecommerce.models.Category;
import com.day1.Ecommerce.models.Product;
import com.day1.Ecommerce.repository.CategoryRepo;
import com.day1.Ecommerce.service.ProductService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/product")
@Tag(name = "product related apis",description = "this api handles all features related to the products")
public class ProductController {
    private CategoryRepo categoryRepo;
    private ProductService productService;
    public ProductController(CategoryRepo categoryRepo,ProductService productService) {
        this.productService=productService;
        this.categoryRepo = categoryRepo;
    }



    @PostMapping("/add")
    @Operation(summary = "add new products",description = "new products can be added to the stock")
    public ResponseEntity<?> addProduct(@RequestBody @Valid ProductDto productDto)
    {
        Product product=new Product();
        product.setName(product.getName());
        product.setDescription(productDto.getDescription());
        product.setPrice( Double.parseDouble(productDto.getPrice()));
        product.setStockQuantity(productDto.getStockQuantity());
        Category category=categoryRepo.findByname(productDto.getCategory()).orElseThrow(()->new RuntimeException("category not found"));
        product.setCategory(category);
        return productService.saveProduct(product);

    }
}
