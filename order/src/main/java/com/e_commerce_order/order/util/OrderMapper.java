package com.e_commerce_order.order.util;

import com.e_commerce_order.order.dto.OrderRequest;
import com.e_commerce_order.order.dto.OrderResponse;
import com.e_commerce_order.order.model.Order;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class OrderMapper {
    public static Order mapToOrder(OrderRequest orderRequest) {
        Order order = new Order();
        order.setProductId(orderRequest.productId());
        order.setQuantity(orderRequest.quantity());

        return order;
    }

    public static OrderResponse mapToOrderResponse(Order order) {
        return new OrderResponse(order.getId(),
                order.getProductId(),
                order.getQuantity());
    }
}
