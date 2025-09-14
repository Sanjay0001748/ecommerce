package com.day1.Ecommerce.controller;

import com.day1.Ecommerce.dtos.CartDto;
import com.day1.Ecommerce.dtos.CartItemDto;
import com.day1.Ecommerce.models.Cart;
import com.day1.Ecommerce.models.CartItems;
import com.day1.Ecommerce.models.Users;
import com.day1.Ecommerce.repository.UserRepo;
import com.day1.Ecommerce.service.CartService;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api/cart")
@Tag(name="cart related apis",description = "this api defines cart functions such as insert,delete ,update product into cart")
public class CartController {
    @Autowired
    private UserRepo userRepo;
    @Autowired
    private CartService cartService;

    @PostMapping("/cart")
    public ResponseEntity<?> addProductToCart(@RequestBody @Valid CartDto cartDto) throws Exception {
        Cart cart=new Cart();
        Optional<Users> users=userRepo.findByphone(cartDto.getPhone());
        if(users.isEmpty())
        {
            throw new Exception("user not found");
        }
        else
        {
            cart.setUsers(users.get());
        }
        return cartService.saveCart(cart);

    }
    @PostMapping("/addProduct")
    public ResponseEntity<?> addProduct(@RequestBody @Valid CartItemDto cartItemDto)
    {
        CartItems cartItems=new CartItems();
        cartItems.setQuantity(cartItemDto.getQuantity());

    }
}
