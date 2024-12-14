package com.ecommerce_demo.product_api.util;

import com.ecommerce_demo.product_api.dto.ProductRequest;
import com.ecommerce_demo.product_api.model.Product;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;


@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ProductMapper {

    public static Product mapToProduct(ProductRequest productRequest) {
        if (productRequest == null) {
            throw new IllegalArgumentException("ProductRequest cannot be null");
        }

        Product product = new Product();
        product.setId(productRequest.id());
        product.setName(productRequest.name());
        product.setDescription(productRequest.description());
        product.setPrice(productRequest.price());
        return product;
    }
}