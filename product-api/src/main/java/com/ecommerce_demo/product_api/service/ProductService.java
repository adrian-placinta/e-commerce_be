package com.ecommerce_demo.product_api.service;

import com.ecommerce_demo.product_api.dto.ProductRequest;

public interface ProductService {
    void saveProduct(ProductRequest productRequest);
}
