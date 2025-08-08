package com.dealmart.ecommerce.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dealmart.ecommerce.model.CartItem;
import com.dealmart.ecommerce.repository.CartItemRepository;

@Repository
public class CartItemDao {
	
	@Autowired
	CartItemRepository CartItemRepository;
	
	public CartItem saveCartItem(CartItem item) {
        return CartItemRepository.save(item);
    }

}
