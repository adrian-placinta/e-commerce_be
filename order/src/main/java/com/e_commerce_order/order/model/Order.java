package com.e_commerce_order.order.model;

import jakarta.persistence.*;

@Entity
@Table(name = "t_order")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(name = "product_id")
    Long productId;
    Long quantity;
}
