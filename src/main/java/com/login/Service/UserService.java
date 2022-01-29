package com.login.Service;

import org.springframework.stereotype.Service;

import com.login.Model.User;

@Service
public interface UserService {

	public User addUser(User user);
	public User login(String username,String password);
	
}