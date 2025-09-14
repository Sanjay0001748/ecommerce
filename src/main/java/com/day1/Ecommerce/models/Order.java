package com.day1.Ecommerce.models;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer orderNumber;
    private String status;
    @ManyToOne
    @JoinColumn(name = "userId")
    private Users users;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    @OneToOne(mappedBy = "order")
    private Payment payment;
    @OneToOne(mappedBy = "order")
    private Shipment shipment;
    @OneToMany(mappedBy = "order")
    private List<OrderItems> orderItemsArrayList;


}
