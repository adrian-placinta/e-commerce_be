package com.e_commerce_order.order.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "t_orders")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(name = "product_id")
    Long productId;
    Long quantity;
}
