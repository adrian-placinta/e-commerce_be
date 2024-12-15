package com.e_commerce_order.order.service;

import com.e_commerce_order.order.dto.OrderRequest;
import com.e_commerce_order.order.dto.OrderResponse;
import org.springframework.http.ResponseEntity;

import java.util.Optional;

public interface OrderService {
    ResponseEntity<OrderResponse> placeOrder(OrderRequest orderRequest);
}
