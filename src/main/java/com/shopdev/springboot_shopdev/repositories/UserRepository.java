package com.shopdev.springboot_shopdev.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.shopdev.springboot_shopdev.entities.user.UserEntity;

import jakarta.transaction.Transactional;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
    
    UserEntity findByUserNameAndUserEmail(String userName, String userEmail);
    UserEntity findByUserName(String userName);
    UserEntity findByUserEmail(String userEmail);

    /*
     * Where userName like ?%
     */
    List<UserEntity> findByUserNameStartingWith(String userName);
    List<UserEntity> findByUserNameEndingWith(String userName);
    List<UserEntity> findByUserNameContaining(String userName);

    // JPQL query to get all users, using entity alias instead of SQL *
    @Query("SELECT u FROM UserEntity u")
    List<UserEntity> getAllUsers();

    // JPQL query with parameter
    @Query("SELECT u FROM UserEntity u WHERE u.userName = ?1")
    UserEntity getUserByUserName(String userName);

    // Update userName by id using JPQL
    @Modifying
    @Query("UPDATE UserEntity u SET u.userName = :userName WHERE u.id = :id")
    @Transactional
    int updateUserName(@Param("userName") String userName, @Param("id") Long id);

    // native query for counting users
    @Query(value = "SELECT COUNT(id) FROM users", nativeQuery = true)
    long countAllUsers();
}