package com.hospital.user.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hospital.user.model.ConsumeByClass;
import com.hospital.user.model.Medicine;
import com.hospital.user.model.User;

@Repository
public class MedicineDaoImpl implements MedicineDao{
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public Medicine add(Medicine m) {
		return (Medicine)sessionFactory.getCurrentSession().save(m);
	}

	@Override
	public void addConsume(String mname, int num) {
		sessionFactory.getCurrentSession()
		.createQuery("update Medicine m set m.consume=m.consume+?  where m.mname=?")
		.setParameter(0, num)
		.setString(1, mname)
		.executeUpdate();
		
	}

	@Override
	public List<ConsumeByClass> countConsume() {

		return ( List<ConsumeByClass>)sessionFactory.getCurrentSession()
				.createQuery("from ConsumeByClass")
				.list();
	}

	@Override
	public Medicine findByName(String Mname) {
		// TODO Auto-generated method stub
		return (Medicine)sessionFactory.getCurrentSession()
				.createQuery("from Medicine where Mname=?")
				.setParameter(0, Mname)
				.uniqueResult();		}

	@Override
	public void deleteByName(String Mname) {
		sessionFactory.getCurrentSession()
		.createQuery("delete from Medicine where Mname=?")
		.setParameter(0, Mname).executeUpdate();
		
	}

}
