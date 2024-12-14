package com.ecommerce_demo.product_api.dto;

import java.math.BigDecimal;

public record ProductRequest(Long id, String name, String description, BigDecimal price) {
}
