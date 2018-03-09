package com.hospital.user.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hospital.user.model.CheckIO;


@Repository
public class CheckIODaoImpl implements CheckIODao {
	@Autowired
	protected SessionFactory sessionfactory;
	@Override
	public List<CheckIO> FindAllCheckIO() {
		
		return sessionfactory.getCurrentSession()
				.createQuery("from CheckIO")
				.list();
	}

	@Override
	public void AddCheckIO(CheckIO checkio) {
		sessionfactory.getCurrentSession()
		.save(checkio);

	}

	@Override
	public CheckIO FindByNo(String hosNo) {
		
		return (CheckIO) sessionfactory.getCurrentSession()
				.createQuery("from CheckIO where hosNo = ?")
				.setParameter(0, hosNo)
				.uniqueResult();
	}

	@Override
	public void DeleteCheckIO(String hosNo) {
		sessionfactory.getCurrentSession()
		.createQuery("delete from Patient where hosNo = ?")
		.setParameter(0, hosNo)
		.executeUpdate();

	}

}
