package com.dealmart.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dealmart.ecommerce.model.User;
import com.dealmart.ecommerce.service.UserService;



@RestController
@ResponseBody
public class UserController {
	
	@Autowired
	UserService userService;
	
	@PostMapping("/users/register")
	public ResponseEntity<?> registerUser(@RequestBody User user) {
	    return userService.registerUser(user);
	}

    
    @GetMapping("/users/register")
    public ResponseEntity<?> findAllUsers() {
	    return userService.findAllUsers();
	}
    
    
    
    
    
    
    
    
    
    
    
    
    
}
