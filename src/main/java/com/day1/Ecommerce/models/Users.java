package com.day1.Ecommerce.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotNull(message = "name must not be null")
    private String name;
    private String email;
    private String role;
    private String password;
    private String phone;
    private LocalDateTime createdAt;
    @OneToOne(mappedBy = "users")
    private Cart cart;
    @OneToMany(mappedBy = "users")
    private List<Order> orderArrayList;
    @OneToMany(mappedBy = "users")
    private List<Product> productArrayList;
    @OneToMany(mappedBy = "users")
    private List<Reviews> reviewsList;

}
