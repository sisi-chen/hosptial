package com.hospital.user.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hospital.user.model.Doctor;
import com.hospital.user.model.Patient;


@Repository
public class PatientDaoImpl implements PatientDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void findByNo(String Pno) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Add(Patient patient) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession()
				.save(patient);
	}




}
