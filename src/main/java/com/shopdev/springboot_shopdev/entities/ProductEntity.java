package com.shopdev.springboot_shopdev.entities;

import java.math.BigDecimal;

public class ProductEntity {
    private long id;
    private String productName;
    private BigDecimal productPrice;

    
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public BigDecimal getProductPrice() {
        return productPrice;
    }
    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    
}
