package com.login.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "admin")
public class Admin {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int adminId;
	
	private String username;
	private String password;

	//private long adminId;
	

	public int getAdminId() {
		return adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	

	

	public Admin(int adminId, String username, String password) {
		super();
		this.adminId = adminId;
		this.username = username;
		this.password = password;
	}
	

	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Admin [AdminId=" +adminId + ", username=" + username + ", password=" + password +  "]";
	}

}