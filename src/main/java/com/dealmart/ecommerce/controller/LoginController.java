package com.dealmart.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dealmart.ecommerce.model.Login;
import com.dealmart.ecommerce.service.LoginService;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
public class LoginController {
	
	@Autowired
	LoginService loginService;
	
	
	@PostMapping("/login")
	public ResponseEntity<?> saveLoginData(@RequestBody Login login){
		return loginService.saveLoginData(login);
	}

	@GetMapping("/login")
	public ResponseEntity<?> saveLoginFindAll(){
		return loginService.saveLoginFindAll();
	}

	
}
