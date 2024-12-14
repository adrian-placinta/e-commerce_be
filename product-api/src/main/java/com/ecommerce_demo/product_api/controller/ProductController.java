package com.ecommerce_demo.product_api.controller;

import com.ecommerce_demo.product_api.dto.ProductRequest;
import com.ecommerce_demo.product_api.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/product/")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void addProduct(@RequestBody ProductRequest productRequest) {
        this.productService.saveProduct(productRequest);
    }
}
