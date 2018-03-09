package com.hospital.user.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hospital.user.model.Doctor;
import com.hospital.user.model.Registration;

@Repository
public class RegistrationDaoImpl implements RegistrationDao {
	
	@Autowired
	private SessionFactory sessionfactory;



	@Override
	public List<Registration> FindByDNo(String Dname) {
		// TODO Auto-generated method stub
	 return	sessionfactory.getCurrentSession()
		.createQuery("from Registration where DNo = ?")
		.setParameter(0, Dname)	
		.list();
	}



	@Override
	public void Add(Registration registration) {
		// TODO Auto-generated method stub
		 sessionfactory.getCurrentSession().save(registration);
	}



	@Override
	public void ModifyReg(String Rno, String Rstate) {
		// TODO Auto-generated method stub
		sessionfactory.getCurrentSession()
		.createQuery("update Registration r set r.rState=?  where r.rNo=?")
		.setString(0, Rstate)
		.setString(1, Rno)
		.executeUpdate();
	}




	

}
