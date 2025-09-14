package com.day1.Ecommerce.service;

import com.day1.Ecommerce.models.Cart;
import com.day1.Ecommerce.models.CartItems;
import com.day1.Ecommerce.repository.CartItemRepo;
import com.day1.Ecommerce.repository.CartRepo;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class CartService {

    private CartRepo cartRepo;
    private CartItemRepo cartItemRepo;

    public CartService(CartRepo cartRepo,CartItemRepo cartItemRepo) {
        this.cartItemRepo=cartItemRepo;
        this.cartRepo = cartRepo;
    }

    public ResponseEntity<?> saveCart(Cart cart) {
        cartRepo.save(cart);
        HashMap<String,Object> response=new HashMap<>();
        response.put("success",true);
        response.put("msg","cart has been created successfully");
        return ResponseEntity.ok(response);

    }

    public ResponseEntity<?> saveCartItems(CartItems cartItems) {
        cartItemRepo.save(cartItems);
        HashMap<String,Object> response=new HashMap<>();
        response.put("success",true);
        response.put("msg","cartItems  has been created successfully");
        return ResponseEntity.ok(response);

    }
}
