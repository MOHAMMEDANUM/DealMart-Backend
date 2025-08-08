package com.dealmart.ecommerce.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dealmart.ecommerce.model.User;
import com.dealmart.ecommerce.repository.UserRepository;

@Repository
public class UserDao {
	
	@Autowired
	UserRepository userRepository;

	public User registerUser(User user) {
		return userRepository.save(user);
	}

	public List<User> findAllUsers() {
		return userRepository.findAll();
	}

	
	

}
