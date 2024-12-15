package com.e_commerce_order.order.controller;

import com.e_commerce_order.order.dto.OrderRequest;
import com.e_commerce_order.order.dto.OrderResponse;
import com.e_commerce_order.order.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/order/")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

    @PostMapping
    ResponseEntity<OrderResponse> placeOrder(@RequestBody OrderRequest orderRequest) {
        return this.orderService.placeOrder(orderRequest);
    }

}
