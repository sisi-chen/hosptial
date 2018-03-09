package com.hospital.user.dao;

import java.util.List;

import com.hospital.user.model.Message;

public interface MessageDao {
	public List<Message> showMessage(String Dno);
	public void AddMessage(Message mess);
	public void AddAnswer(String DNo,String Answer);
}
