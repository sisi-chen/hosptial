package com.hospital.user.dao;

import com.hospital.user.model.User;

public interface UserDao {

	public User  findById(String Uname);
	public void PasswordModify(String Uname,String newP);
}
