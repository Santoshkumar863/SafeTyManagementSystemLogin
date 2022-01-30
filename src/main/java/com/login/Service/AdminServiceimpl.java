package com.login.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.login.Model.Admin;
import com.login.Repository.AdminRepository;

@Service
public class AdminServiceimpl implements AdminService
{


	@Autowired
	AdminRepository repo;
	


	@Override
	public Admin addAdmin(Admin admin) {
		// TODO Auto-generated method stub
		return repo.save(admin);
	}



	@Override
	public Admin admin(String username, String password) {
		Admin admin=repo.findByUsernameAndPassword(username,password);
		return admin;
	}

//	@Override
//	public Admin admin(String username, String password) {
//		// TODO Auto-generated method stub
//		return null;
//	}

	



	
	
	
		
			

	}

