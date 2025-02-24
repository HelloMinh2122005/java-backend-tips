package com.shopdev.springboot_shopdev.repositories.impl;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.shopdev.springboot_shopdev.entities.ProductEntity;
import com.shopdev.springboot_shopdev.repositories.ProductRepository;


@Repository
public class ProductRepositoryImpl implements ProductRepository {
    @Override
    public ProductEntity createProduct(ProductEntity productEntity) {
        ProductEntity product = new ProductEntity();
        product.setProductName("Test Product");
        product.setId(1L);
        product.setProductPrice(new BigDecimal(10.6));

        return product;
    }

    @Override
    public List<ProductEntity> getAllProducts() {
        ProductEntity product = new ProductEntity();
        product.setProductName("Test Product");
        product.setId(1L);
        product.setProductPrice(new BigDecimal(10.6));

        return List.of(product);
    }
    
}
