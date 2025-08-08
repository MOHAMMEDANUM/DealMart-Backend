package com.dealmart.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dealmart.ecommerce.model.Login;

public interface LoginRepository  extends JpaRepository<Login, Integer>{

	
}
