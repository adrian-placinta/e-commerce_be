package com.ecommerce_demo.product_api.service.impl;

import com.ecommerce_demo.product_api.dto.ProductRequest;
import com.ecommerce_demo.product_api.repository.ProductRepository;
import com.ecommerce_demo.product_api.service.ProductService;
import com.ecommerce_demo.product_api.util.ProductMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Override
    public void saveProduct(ProductRequest productRequest) {
        this.productRepository.save(ProductMapper.mapToProduct(productRequest));
    }
}
