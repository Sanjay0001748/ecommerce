package com.day1.Ecommerce.repository;

import com.day1.Ecommerce.models.Cart;
import com.day1.Ecommerce.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CartRepo extends JpaRepository<Cart,Integer> {
    Optional<Cart> findByusers(Users users);
}
