package com.login.Service;

import org.springframework.stereotype.Service;

import com.login.Model.Admin;

@Service
public interface AdminService {

	
	public Admin addAdmin(Admin admin);
	public Admin admin(String username, String password);
	
}