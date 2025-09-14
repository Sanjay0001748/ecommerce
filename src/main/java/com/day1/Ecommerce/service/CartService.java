package com.day1.Ecommerce.service;

import com.day1.Ecommerce.models.Cart;
import com.day1.Ecommerce.repository.CartRepo;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class CartService {

    private CartRepo cartRepo;

    public CartService(CartRepo cartRepo) {
        this.cartRepo = cartRepo;
    }

    public ResponseEntity<?> saveCart(Cart cart) {
        cartRepo.save(cart);
        HashMap<String,Object> response=new HashMap<>();
        response.put("success",true);
        response.put("msg","cart has been created successfully");
        return ResponseEntity.ok(response);

    }
}
