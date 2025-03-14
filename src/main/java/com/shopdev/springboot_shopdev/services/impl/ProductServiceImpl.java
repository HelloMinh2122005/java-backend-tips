package com.shopdev.springboot_shopdev.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopdev.springboot_shopdev.entities.ProductEntity;
import com.shopdev.springboot_shopdev.repositories.ProductRepository;
import com.shopdev.springboot_shopdev.services.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
    
    private final ProductRepository productRepository;
    
    @Autowired
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public ProductEntity createProduct(ProductEntity productEntity) {
        return productRepository.createProduct(productEntity);
    }

    @Override
    public List<ProductEntity> getAllProducts() {
        return productRepository.getAllProducts();
    }
}