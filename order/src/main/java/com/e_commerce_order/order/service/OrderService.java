package com.e_commerce_order.order.service;

import com.e_commerce_order.order.dto.OrderReq;

public interface OrderService {
    void placeOrder(OrderReq orderReq);
}
