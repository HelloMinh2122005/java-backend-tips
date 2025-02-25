package com.shopdev.springboot_shopdev.entities;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
public class ProductEntity {

    @Id
    @Getter
    @Setter
    private long id;

    @Getter
    @Setter
    private String productName;

    @Getter
    @Setter
    private BigDecimal productPrice;
}
