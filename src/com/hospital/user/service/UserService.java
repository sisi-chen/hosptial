package com.hospital.user.service;



import com.hospital.user.model.User;

public interface UserService{
	public User  Login(String Uname,String password);
	public User findByNo(String Uname);
	public String  PasswordModify(String Uname,String oldP,String newP1,String newP2);
	}