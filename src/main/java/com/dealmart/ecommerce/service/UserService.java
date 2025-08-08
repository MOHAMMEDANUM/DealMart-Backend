package com.dealmart.ecommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.dealmart.ecommerce.dao.UserDao;
import com.dealmart.ecommerce.model.User;

@Service
public class UserService {
	
	@Autowired
	UserDao userDao;

	public ResponseEntity<?> registerUser(User user) {
		User saveUser=userDao.registerUser(user);
		return ResponseEntity.status(HttpStatus.CREATED).body("User registered successfully! :- \n\n"+saveUser);
	}

	public ResponseEntity<?> findAllUsers() {
		List<User> allUsers = userDao.findAllUsers();
		if(allUsers.isEmpty()) {
			return ResponseEntity.status(404).body("Unable to fetch the Users Data from DB");
		}
		else {
			String users="";
			for(User u:allUsers) {
				users+=u;
				users+="\n";
			}
			return ResponseEntity.status(200).body("Users are :- \n\n "+users);
		}
	}

	

}
