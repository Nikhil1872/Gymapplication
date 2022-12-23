package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.dao.userdao;
import com.demo.model.User;


@RestController
@CrossOrigin(origins="http://localhost:4200")
public class Usercontroller {
	
	@Autowired
	private userdao u1;
	

	@CrossOrigin(origins="http://localhost:4200")
	@PostMapping("/insertrecord")
	public User insertrecord(@RequestBody User u )
	{
		return this.u1.save(u);
	}
	
	@CrossOrigin(origins="http://localhost:4200")
	@PostMapping("/deleterecord")
	public void deleterecord(@RequestBody User u )
	{
		 this.u1.delete(u);
	}
	
	@CrossOrigin(origins="http://localhost:4200")
	@PostMapping("/updaterecord")
	public User updaterecord(@RequestBody User u )
	{
		return this.u1.save(u);
		 
	}
	
	@CrossOrigin(origins="http://localhost:4200")
	@PostMapping("/viewrecord")
	public List<User> viewrecord(){
		return this.u1.findAll();
		
	}
}
