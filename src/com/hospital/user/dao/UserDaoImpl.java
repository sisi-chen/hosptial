package com.hospital.user.dao;


import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Repository;

import com.hospital.user.model.User;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	
	
	@Override
	public User findById(String Uname) {
		// TODO Auto-generated method stub
		return (User)sessionFactory.getCurrentSession()
				.createQuery("from User where id=?")
				.setParameter(0, Uname)
				.uniqueResult();		
	}

	@Override
		public void PasswordModify(String Uname,String newP) {
		// TODO Auto-generated method stub
		 sessionFactory.getCurrentSession()
				.createQuery("update User u set u.password=?  where u.id=?")
				.setString(0, newP)
				.setString(1, Uname)
				.executeUpdate();
		
		 /* String hql = "update User u set u.userName = ?,u.age=? where u.id = ?";  
	        Query query = sessionFactory.getCurrentSession().createQuery(hql);  
	        query.setString(0, user.getUserName());  
	        query.setString(1, user.getAge());  
	        query.setString(2, user.getId());  
	          
	        return (query.executeUpdate() > 0);  */
	}


	}


