package com.dealmart.ecommerce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.dealmart.ecommerce.dao.CartItemDao;
import com.dealmart.ecommerce.model.CartItem;

@Service
public class CartItemService {
	
	@Autowired
	CartItemDao cartItemDao;
	
	public ResponseEntity<?> addToCart(CartItem cartItem) {
		cartItemDao.saveCartItem(cartItem);
        return ResponseEntity.status(HttpStatus.CREATED).body("Item added to cart successfully! :- \n\n"+cartItem);
    }

}
