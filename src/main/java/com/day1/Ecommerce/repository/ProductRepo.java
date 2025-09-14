package com.day1.Ecommerce.repository;

import com.day1.Ecommerce.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductRepo extends JpaRepository<Product,Integer> {

    Optional<Product> findByname(String name);
}
