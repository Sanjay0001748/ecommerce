package com.day1.Ecommerce.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class OrderItems {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    @JoinColumn(name="productId")
    private Product products;
    private Integer quantity;
    private Double priceAtPurchase;
    @ManyToOne
    @JoinColumn(name = "orderId")
    private Order order;


}
