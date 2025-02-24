package com.shopdev.springboot_shopdev.repositories;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.shopdev.springboot_shopdev.entities.ProductEntity;

@Repository
public interface ProductRepository {
    ProductEntity createProduct(ProductEntity productEntity);
    List<ProductEntity> getAllProducts();
}
