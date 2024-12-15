package com.e_commerce_order.order.service.impl;

import com.e_commerce_order.order.client.InventoryClient;
import com.e_commerce_order.order.dto.OrderRequest;
import com.e_commerce_order.order.dto.OrderResponse;
import com.e_commerce_order.order.model.Order;
import com.e_commerce_order.order.repository.OrderRepository;
import com.e_commerce_order.order.service.OrderService;
import com.e_commerce_order.order.util.OrderMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;
    private final InventoryClient inventoryClient;

    @Override
    public ResponseEntity<OrderResponse> placeOrder(OrderRequest orderRequest) {
        boolean isInStock = this.inventoryClient.isInStock(orderRequest.productId());

        if (isInStock) {
            Order savedOrder = orderRepository.save(OrderMapper.mapToOrder(orderRequest));
            OrderResponse orderResponse = OrderMapper.mapToOrderResponse(savedOrder);

            return ResponseEntity.ok(orderResponse);
        }

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
    }

}
