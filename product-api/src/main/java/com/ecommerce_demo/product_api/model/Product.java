package com.ecommerce_demo.product_api.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "t_product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private BigDecimal price;
}
