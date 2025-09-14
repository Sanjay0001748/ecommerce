package com.day1.Ecommerce.repository;

import com.day1.Ecommerce.models.CartItems;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartItemRepo extends JpaRepository<CartItems,Integer> {
}
