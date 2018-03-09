package com.hospital.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hospital.user.dao.DoctorDao;
import com.hospital.user.dao.MessageDao;
import com.hospital.user.dao.RegistrationDao;
import com.hospital.user.model.Doctor;
import com.hospital.user.model.Message;
import com.hospital.user.model.Registration;

@Service
@Transactional
public class TouristServiceImpl implements TouristService {
	@Autowired
	private DoctorDao doctordao;
	
	@Autowired
	private RegistrationDao regdao;
	
	@Autowired
	private MessageDao messdao;
	
	@Override
	public void Regist(Registration reg) {
		// TODO Auto-generated method stub
		regdao.Add(reg);
	}

	@Override
	public void LeaveMessage(Message mess) {
		// TODO Auto-generated method stub
		messdao.AddMessage(mess);
	}

	@Override
	public List<Doctor> showDoctor(String AOName) {
		// TODO Auto-generated method stub
		return doctordao.showDoctor(AOName);
	}

	@Override
	public List<Message> showMess(String DNo) {
		// TODO Auto-generated method stub
		return messdao.showMessage(DNo);
	}

}
