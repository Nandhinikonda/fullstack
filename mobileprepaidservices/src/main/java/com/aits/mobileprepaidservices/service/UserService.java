package com.aits.mobileprepaidservices.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aits.mobileprepaidservices.entity.User;
import com.aits.mobileprepaidservices.repo.UserRepository;

@Service
public class UserService {
	@Autowired
	UserRepository userrepository;
	public User insert(User user) {
		return userrepository.save(user);
	}
	public List<User> fetchAllUsers(){
	List<User> users=userrepository.findAll();
	return users;
	}
}