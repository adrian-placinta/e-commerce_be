package com.e_commerce_order.order.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "${inventory_service_name}", url = "${inventory_url}")
public interface InventoryClient {
    @GetMapping(path = "stock")
    Boolean isInStock(@RequestParam Long productId);
}
