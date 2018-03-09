package com.hospital.user.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hospital.user.model.Prescription;

@Repository
public class PrescriptionDaoImpl implements PrescriptionDao {

	@Autowired
	private SessionFactory sessionfavtory;
	
	@Override
	public void Add(Prescription pre) {
		// TODO Auto-generated method stub
		sessionfavtory.getCurrentSession().save(pre);
	}

}
