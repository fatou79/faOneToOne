package com.fatou.OneToOne.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fatou.OneToOne.entity.User;
import com.fatou.OneToOne.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService service;
	
	
	
	@PostMapping("/newUser")
	public ResponseEntity<User> newUser(@RequestBody User user){
		return new ResponseEntity<User>(service.addNewUser(user), HttpStatus.CREATED);
		
	}

}
