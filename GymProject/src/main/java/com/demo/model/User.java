package com.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	
	@Id
	private String email;
	private int mno;
	private String uname;
	private int age;
	private String gender;
	private int adharno;
	private String password;
	
	
	
	
	public User() {
		super();
		
	}
	public User(String email, int mno, String uname, int age, String gender, int adharno, String password) {
		super();
		this.email = email;
		this.mno = mno;
		this.uname = uname;
		this.age = age;
		this.gender = gender;
		this.adharno = adharno;
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getMno() {
		return mno;
	}
	public void setMno(int mno) {
		this.mno = mno;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAdharno() {
		return adharno;
	}
	public void setAdharno(int adharno) {
		this.adharno = adharno;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	

}
