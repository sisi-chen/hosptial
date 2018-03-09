package com.hospital.user.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hospital.user.model.Case;


@Repository
public class CaseDaoImpl implements CaseDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void Add(Case cass) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession()
		.save(cass);
		
	}

	@Override
	public List<Case> findByNo(String DName) {
		// TODO Auto-generated method stub
		System.out.println(DName);
		return (List<Case>)sessionFactory.getCurrentSession()
				.createQuery("from Case where DName = ?")
				.setParameter(0, DName)
				.list();
	}

	@Override
	public List<Case> findById(String Id) {
		// TODO Auto-generated method stub
		return (List<Case>)sessionFactory.getCurrentSession()
				.createQuery("from Case where IdCard = ?")
				.setParameter(0, Id)
				.list();
	}

}
