package com.login.Controller;

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

import com.login.Model.Admin;
import com.login.Service.AdminServiceimpl;


@RestController
public class AdminRestController
{
	@Autowired
	AdminServiceimpl Service;
	
	@PostMapping("/Regist")
	public ResponseEntity<Admin> Incident(@Validated @RequestBody Admin admin)
	{
		System.out.println("Rest");
		Admin e= Service.addAdmin(admin);
		System.out.println(e);
		//return  ResponseEntity.ok().body("Registration Successfully");
		return new ResponseEntity<Admin>(e,HttpStatus.OK);
	}
	
	
	@GetMapping("/login")
	public ResponseEntity createAdmin(@Validated @RequestBody Admin admin)
	{
	Admin us=Service.admin(admin.getUsername(), admin.getPassword());
	
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

	