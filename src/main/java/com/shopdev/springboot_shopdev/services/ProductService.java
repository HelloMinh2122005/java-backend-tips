package com.shopdev.springboot_shopdev.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.shopdev.springboot_shopdev.entities.ProductEntity;

@Service
public interface ProductService {
    ProductEntity createProduct(ProductEntity productEntity);
    List<ProductEntity> getAllProducts();
}
