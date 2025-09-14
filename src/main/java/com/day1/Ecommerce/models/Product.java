package com.day1.Ecommerce.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String description;
    private double price;
    private Integer stockQuantity;
    @ManyToOne
    @JoinColumn(name = "categoryId")
    private Category category;
    @ManyToOne
    @JoinColumn(name = "sellerId")
    private Users users;
    @OneToMany(mappedBy = "product")
    private List<Reviews> reviewsArrayList;
    @OneToMany(mappedBy = "products")
    private List<OrderItems> orderItemsList;




}
