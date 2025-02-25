package com.shopdev.springboot_shopdev.services;

import java.util.List;

import com.shopdev.springboot_shopdev.entities.user.UserEntity;

public interface UserService {
    UserEntity createUser(UserEntity userEntity);
    List<UserEntity> getAllUsers();
}
