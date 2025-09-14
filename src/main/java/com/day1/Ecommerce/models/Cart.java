package com.day1.Ecommerce.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @OneToOne
    @JoinColumn(name="userId",unique = true)
    private Users users;

    @OneToMany(mappedBy = "cart")
    private List<CartItems> cartItemsArrayList;


}
