package com.hospital.user.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hospital.user.dao.UserDao;
import com.hospital.user.model.User;


@Service
@Transactional
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userdao;
	
	@Override
	public User Login(String Uname,String password){
			User user=userdao.findById(Uname);
			if(user.getPassword().equals(password))
			return user;
			else
			return null;
		}
	
	@Override
	public String  PasswordModify(String Uname,String oldP,String newP1,String newP2){
		User user = userdao.findById(Uname);
		if(user.getPassword().equals(oldP))
		{
			if(newP1.equals(newP2))
			userdao.PasswordModify(Uname,newP1);
		    return "OK";
		}
		else
		return "ERROR";
	}

	

	
	@Override
	public User findByNo(String Uname) {
		// TODO Auto-generated method stub
		return userdao.findById(Uname);
	}
}
