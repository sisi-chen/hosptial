package com.hospital.user.dao;

import java.util.List;

import com.hospital.user.model.Doctor;

public interface DoctorDao {
	public Doctor findById(String dname);
	public List<Doctor> findalldoc();
	public List<Doctor> showDoctor(String AOName);
	public List<Doctor> FindAllDoctor();
	
	public void DeleteDoctor(String dNo);
	public void AddDoctor(Doctor doctor);
	public Doctor SearchDoctor(String dNo);
	public boolean ModifyState(String dNo);
	
	public Doctor Add(String Pname, String sex, int age, String Tel,
			String Addr, String history);
}
