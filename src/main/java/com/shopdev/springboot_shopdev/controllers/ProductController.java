package com.shopdev.springboot_shopdev.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shopdev.springboot_shopdev.entities.ProductEntity;
import com.shopdev.springboot_shopdev.services.ProductService;

@RestController
@RequestMapping("/v1/api")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/add")
    public ProductEntity createProductEntity(ProductEntity productEntity) {
        return productService.createProduct(productEntity);
    }

    @GetMapping("/all")
    public List<ProductEntity> getAllProducts() {
        return productService.getAllProducts();
    }
}
