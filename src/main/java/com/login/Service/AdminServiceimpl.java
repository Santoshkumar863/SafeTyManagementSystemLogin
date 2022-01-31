package com.login.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.login.Model.Admin;
import com.login.Repository.AdminRepository;

@Service
public class AdminServiceimpl 
{


	@Autowired
	AdminRepository repo;
	


	
	public Admin addAdmin(Admin admin) {
		// TODO Auto-generated method stub
		return repo.save(admin);
	}




	public Admin admin(String username, String password) {
		Admin admin=repo.findByUsernameAndPassword(username,password);
		return admin;
	}

	



	
	
	
		
			

	}

