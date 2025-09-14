package com.day1.Ecommerce.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;

@Entity
@Data
public class CartItems {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "cartId")
    private Cart cart;
    private Integer quantity;
    @ManyToOne
    @JoinColumn(name="productId")
    private Product product;

}
