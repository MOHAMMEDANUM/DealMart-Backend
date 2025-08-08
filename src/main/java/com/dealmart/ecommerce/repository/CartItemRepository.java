package com.dealmart.ecommerce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dealmart.ecommerce.model.CartItem;
import com.dealmart.ecommerce.model.User;

public interface CartItemRepository extends JpaRepository<CartItem, Integer>{

	List<CartItem> findByUser(User user);
	
}