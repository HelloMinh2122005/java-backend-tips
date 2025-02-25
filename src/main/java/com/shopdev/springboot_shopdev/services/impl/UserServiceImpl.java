package com.shopdev.springboot_shopdev.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.shopdev.springboot_shopdev.entities.user.UserEntity;
import com.shopdev.springboot_shopdev.repositories.UserRepository;
import com.shopdev.springboot_shopdev.services.UserService;

public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserEntity createUser(UserEntity userEntity) {
        return userRepository.save(userEntity);
    }

    @Override
    public List<UserEntity> getAllUsers() {
        return userRepository.findAll();
    }
    
}
