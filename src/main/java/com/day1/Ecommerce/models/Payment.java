package com.day1.Ecommerce.models;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Double paymentAmount;
    private String paymentMethod;
    private String paymentStatus;
    @OneToOne
    @JoinColumn(name = "orderId")
    private Order order;
    private LocalDateTime createdAt;



}
