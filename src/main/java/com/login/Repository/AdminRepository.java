package com.login.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.login.Model.Admin;

public interface AdminRepository extends JpaRepository<Admin, Integer>
{
	Admin findByUsernameAndPassword(String getuserName,String password);
	
}