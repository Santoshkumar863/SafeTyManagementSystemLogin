package com.login;

//import org.junit.jupiter.api.Test;
//import org.springframework.boot.test.context.SpringBootTest;
//
//@SpringBootTest
//class SafetyManagementSystemLoginApplicationTests {
//
//	@Test
//	void contextLoads() {
//	}
//
//}
//package com.login;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.login.Model.Admin;
import com.login.Repository.AdminRepository;

import com.login.Service.AdminServiceimpl;


@RunWith(SpringRunner.class)
@SpringBootTest
public class AdminTest {

	@Autowired
	AdminServiceimpl service;
	
	@MockBean
	AdminRepository repository;
	
	@Test
	public void saveAdminTest() {
		
		Admin admin =new Admin(123,"Santosh","Santsoh@123");
		
		when(repository.save(admin)).thenReturn(admin);
		assertEquals(admin,service.addAdmin(admin));
	}

	
	
	
}
