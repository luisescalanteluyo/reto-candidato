package com.luis.demojwt.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luis.demojwt.models.User;

public interface UserRepository extends JpaRepository<User,Integer> {
    Optional<User> findByUsername(String username); 
}
 