package com.dealmart.ecommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.dealmart.ecommerce.dao.LoginDao;
import com.dealmart.ecommerce.model.Login;

@Service
public class LoginService {
	
	@Autowired
	LoginDao loginDao;

	public ResponseEntity<?> saveLoginData(Login login) {
		Login save=loginDao.saveLoginData(login);
			return ResponseEntity.status(201).body(save);	
	}

	public ResponseEntity<?> saveLoginFindAll() {
		List<Login> findAll=loginDao.saveLoginFindAll();
		if(findAll.isEmpty()) {
			return ResponseEntity.status(404).body("Unable to fetch data");
		}
		else {
			return ResponseEntity.status(200).body(findAll);
		}
	}

}
