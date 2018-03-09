package com.hospital.user.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hospital.user.model.Staff;

@Repository
public class StaffDaoImpl implements StaffDao{
	@Autowired
	protected SessionFactory sessionFactory;
	
	@Override
	public void addStaff(Staff staff) {
		

		sessionFactory.getCurrentSession()
				.save(staff);
	}

	@Override
	public Staff findByNo(String sNo) {
		return (Staff) sessionFactory.getCurrentSession()
				.createQuery("from Staff where sNo = ?")
				.setParameter(0, sNo)
				.uniqueResult();
	}

	

	@Override
	public List<Staff> FindAll() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession()
				.createQuery("from Staff")
				.list();
	}

	@Override
	public void DeleteStaff(String sNo) {
		sessionFactory.getCurrentSession()
		.createQuery("delete from Staff where sNo = ?")
		.setParameter(0, sNo)
		.executeUpdate();
		
	}

}
