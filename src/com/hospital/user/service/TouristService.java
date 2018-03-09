package com.hospital.user.service;

import java.util.List;

import com.hospital.user.model.Doctor;
import com.hospital.user.model.Message;
import com.hospital.user.model.Registration;

public interface TouristService {
	public List<Doctor> showDoctor(String AOName);
	public List<Message> showMess(String DNo);
	public void  Regist(Registration reg);
	public void  LeaveMessage(Message mess);
}
