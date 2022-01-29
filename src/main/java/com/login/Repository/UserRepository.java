package com.login.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.login.Model.User;

public interface UserRepository extends JpaRepository<User, Integer>
{
	User findByUsernameAndPassword(String getuserName,String password);
	
}