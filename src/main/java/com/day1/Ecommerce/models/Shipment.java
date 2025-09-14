package com.day1.Ecommerce.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Shipment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String trackingNumber;
    private String carrier;
    private String status;
    @OneToOne
    @JoinColumn(name = "orderId")
    private Order order;

}
