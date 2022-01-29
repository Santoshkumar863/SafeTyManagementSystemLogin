package com.booking.Service;

import org.springframework.stereotype.Service;

import com.booking.Model.User;

@Service
public interface UserService {

	public User addUser(User user);
	public User login(String username,String password);
	//public User updateUser(User user);
}