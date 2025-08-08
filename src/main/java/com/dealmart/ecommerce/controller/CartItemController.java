//package com.dealmart.ecommerce.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.dealmart.ecommerce.model.CartItem;
//import com.dealmart.ecommerce.service.CartItemService;
//
//@RestController
//public class CartItemController {
//
//    @Autowired
//    CartItemService cartService;
//
//    @PostMapping("/cart/add")
//    public ResponseEntity<?> addToCart(@RequestBody CartItem cartItem) {
//        return cartService.addToCart(cartItem);
//    }
//	
//}
