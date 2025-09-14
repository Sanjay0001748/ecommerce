package com.day1.Ecommerce.repository;

import com.day1.Ecommerce.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CategoryRepo extends JpaRepository<Category,Integer> {

    Optional<Category> findByname(String name);

}
