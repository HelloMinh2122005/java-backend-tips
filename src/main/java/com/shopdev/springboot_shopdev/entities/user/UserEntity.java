package com.shopdev.springboot_shopdev.entities.user;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "users")
@DynamicInsert
@DynamicUpdate
public class UserEntity {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; 

    @Column(columnDefinition="varchar(255) comment 'user name'", nullable=false)
    private String userName;

    @Column(columnDefinition="varchar(255) comment 'user name'", nullable=false, unique=true)
    private String userEmail;
}
