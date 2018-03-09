package com.hospital.user.dao;

import java.util.List;


import org.hibernate.SessionFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hospital.user.model.Doctor;

@Repository
public class DoctorDaoImpl implements DoctorDao {
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public Doctor findById(String dname) {
		// TODO Auto-generated method stub
		return (Doctor)sessionFactory.getCurrentSession()
				.createQuery("from Doctor where dname=?")
				.setParameter(0, dname)
				.uniqueResult();		
	}

	@Override
	public List<Doctor> showDoctor(String AOName) {
		// TODO Auto-generated method stub
		String hql="from Doctor where aoname=?";//使用命名参数，推荐使用，易读。

		return (List<Doctor>)sessionFactory.getCurrentSession()
				.createQuery(hql).
				setString(0, AOName)
				.list();

	}

	@Override
	public Doctor Add(String Pname, String sex, int age, String Tel,
			String Addr, String history) {
		// TODO Auto-generated method stub
		return (Doctor)sessionFactory.getCurrentSession()
				.createQuery("insert into Doctor() where Pname = ?,sex = ?, age = ?, Tel = ?, Addr = ?,history = ?")
				.setParameter(0, Pname)
				.setParameter(1, sex)
				.setParameter(2, age)
				.setParameter(3, Tel)
				.setParameter(4, Addr)
				.setParameter(5, history)
				.uniqueResult();	
	}

	@Override
	public List<Doctor> findalldoc() {
		// TODO Auto-generated method stub
		return (List<Doctor>)sessionFactory.getCurrentSession()
				.createQuery("from Doctor ")				
				.list();
	}

	@Override
	public List<Doctor> FindAllDoctor() {
		
		return sessionFactory.getCurrentSession()
				.createQuery("from Doctor")
				.list();
	}

	@Override
	public void AddDoctor(Doctor doctor) {
		sessionFactory.getCurrentSession()
		.save(doctor);
		
	}

	@Override
	public void DeleteDoctor(String dNo) {
		sessionFactory.getCurrentSession()
		.createQuery("delete from Doctor where dno = ?")
		.setParameter(0, dNo)
		.executeUpdate();
		
	}

	@Override
	public Doctor SearchDoctor(String dNo) {
		return (Doctor)sessionFactory.getCurrentSession()
				.createQuery("from Doctor where dno = ?")
				.setParameter(0, dNo)
				.uniqueResult();
	}

	@Override
	public boolean ModifyState(String dNo) {
		String dState="离职";
		System.out.println(dNo);
		return sessionFactory.getCurrentSession()
		.createQuery("Update Doctor d set d.dState = ? where d.dno = ?")
		.setParameter(0, dState)
		.setParameter(1, dNo)
		.executeUpdate()>0;
		 
		
	}   

}
