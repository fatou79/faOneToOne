package com.fatou.OneToOne.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fatou.OneToOne.entity.User;
import com.fatou.OneToOne.repository.UserRepository;

@Service
public class UserService {
	
	
	@Autowired
	private UserRepository repo;
	
	public User addNewUser(User user) {
	return repo.save(user);
	}

}
