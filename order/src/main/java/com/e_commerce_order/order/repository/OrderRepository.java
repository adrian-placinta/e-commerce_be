package com.e_commerce_order.order.repository;

import com.e_commerce_order.order.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
