package com.dealmart.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dealmart.ecommerce.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
