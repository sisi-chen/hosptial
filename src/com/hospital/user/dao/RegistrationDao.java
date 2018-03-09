package com.hospital.user.dao;

import java.util.List;

import com.hospital.user.model.Registration;

public interface RegistrationDao {
	public void Add(Registration registration);
	public List<Registration> FindByDNo(String Dname);
	public void ModifyReg(String Rno,String Rstate);
}
