package com.hospital.user.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hospital.user.model.Logistic;

@Repository
public class LogisticDaoImpl implements LogisticDao{
	@Autowired
	protected SessionFactory sessionfactory;
	@Override
	public List<Logistic> FindAllLogistic() {
		// TODO Auto-generated method stub
		return sessionfactory.getCurrentSession()
				.createQuery("from Logistic")
				.list();
	}
	@Override
	public void AddLogistic(Logistic logistic) {
		sessionfactory.getCurrentSession()
		.save(logistic);
		
	}
	@Override
	public void DeleteLogistic(String lNo) {
		sessionfactory.getCurrentSession()
		.createQuery("delete from Logistic where lNo = ?")
		.setParameter(0, lNo)
		.executeUpdate();
		
	}
	@Override
	public Logistic FindLogisticByNo(String lNo) {
		Logistic log=(Logistic)sessionfactory.getCurrentSession()
				.createQuery("from Logistic where lNo = ?")
				.setParameter(0, lNo)
				.uniqueResult();
		System.out.println(lNo+"heooo");
		//System.out.println(log.getlName());
		
		return log;
	}

}
