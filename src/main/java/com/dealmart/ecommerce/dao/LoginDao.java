package com.dealmart.ecommerce.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dealmart.ecommerce.model.Login;
import com.dealmart.ecommerce.repository.LoginRepository;

@Repository
public class LoginDao {
	
	@Autowired
	LoginRepository loginRepository;

	public Login saveLoginData(Login login) {
		return loginRepository.save(login);
	}

	public List<Login> saveLoginFindAll() {
		return loginRepository.findAll();
	}
	
}
