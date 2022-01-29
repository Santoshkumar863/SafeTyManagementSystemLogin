package com.login.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.login.Model.User;
import com.login.Repository.UserRepository;

@Service
public class UserServiceimpl implements UserService
{


	@Autowired
	UserRepository repo;
	

	@Override
	public User addUser(User user) {
		// TODO Auto-generated method stub
		User user1 = repo.save(user);
		return user;
	}

	@Override
	public User login(String username, String password) {
		User user=repo.findByUsernameAndPassword(username,password);
		return user;
		
	}

	
	
	
		
			

	}

