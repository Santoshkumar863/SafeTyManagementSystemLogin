package com.booking.Controller;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.booking.Model.User;
import com.booking.Service.UserService;

@RestController
public class UserRestController
{
	@Autowired
	UserService Service;
	
	@PostMapping("/Regist")
	public ResponseEntity<User> createProduct(@Validated @RequestBody User user)
	{
		System.out.println("Rest");
		User e= Service.addUser(user);
		System.out.println(e);
		//return  ResponseEntity.ok().body("Registration Successfully");
		return new ResponseEntity<User>(e,HttpStatus.OK);
	}
	
	
	@GetMapping("/login")
	public ResponseEntity createUser(@Validated @RequestBody User user)
	{
	User us=Service.login(user.getUsername(), user.getPassword());
	
	if(Objects.nonNull(us))
	{
		return ResponseEntity.ok().body("Login successfully");
	}
	else
	{
		return ResponseEntity.ok().body("Incorrect username or password");
		
	}
	
	}
	
	
}

	