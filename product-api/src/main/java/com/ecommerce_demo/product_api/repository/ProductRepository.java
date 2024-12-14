package com.ecommerce_demo.product_api.repository;

import com.ecommerce_demo.product_api.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
