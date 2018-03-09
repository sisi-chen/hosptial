package com.hospital.user.dao;

import com.hospital.user.model.Patient;

public interface PatientDao {
	public void Add(Patient patient);
	public void findByNo(String Pno);
}
