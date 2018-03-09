package com.hospital.user.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hospital.user.model.Nurse;

@Repository//ÈÝÆ÷
public class NurseDaoImpl implements NurseDao{
	@Autowired
	protected SessionFactory sessionfactory;
	@Override
	public List<Nurse> FindAllNurse() {
		
		return sessionfactory.getCurrentSession()
				.createQuery("from Nurse")
				.list();
	}
	@Override
	public void AddNurse(Nurse nurse){
				 sessionfactory.getCurrentSession()
				.save(nurse);
	}
	@Override
	public void DeleteNurse(String nNo) {
		sessionfactory.getCurrentSession()
		.createQuery("delete from Nurse where nNo = ?")
		.setParameter(0, nNo)
		.executeUpdate();
	}
	@Override
	public Nurse FindByNo(String nNo) {
		
		return (Nurse)sessionfactory.getCurrentSession()
				.createQuery("from Nurse where nNo=?")
				.setParameter(0, nNo)
				.uniqueResult();
	}
	

}
