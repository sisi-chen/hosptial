package com.hospital.user.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.hospital.user.model.Message;

@Repository
public class MessageDaoImpl implements MessageDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void AddMessage(Message mess) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession()
		.save(mess);
	}

	@Override
	public void AddAnswer(String DNo, String Answer) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession()
		.createQuery("from Message m set m.reply = ? where m.DNo = ?")
		.setParameter(0, Answer)
		.setParameter(1, DNo )
		.uniqueResult();
	}

	@Override
	public List<Message> showMessage(String Dno) {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession()
				.createQuery("from Message where dNo = ?")
				.setParameter(0, Dno)
				.list();
	}


}
