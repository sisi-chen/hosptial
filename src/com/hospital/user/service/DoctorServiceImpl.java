package com.hospital.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hospital.user.dao.CaseDao;
import com.hospital.user.dao.DoctorDao;
import com.hospital.user.dao.MessageDao;
import com.hospital.user.dao.PatientDao;
import com.hospital.user.dao.PrescriptionDao;
import com.hospital.user.dao.RegistrationDao;
import com.hospital.user.model.Case;
import com.hospital.user.model.Doctor;
import com.hospital.user.model.Patient;
import com.hospital.user.model.Prescription;
import com.hospital.user.model.Registration;


@Service
@Transactional
public class DoctorServiceImpl implements DoctorService {
	
	@Autowired
	private DoctorDao doctordao;
	
	@Autowired
	private RegistrationDao rdao;
	
	@Autowired
	private PatientDao patdao;
	
	@Autowired
	private CaseDao casedao;
	
	@Autowired
	private PrescriptionDao predao;
	
	@Autowired
	private MessageDao messdao;

	@Override
	public void AnswerMessage(String DNo,String answer) {
		// TODO Auto-generated method stub
		messdao.AddAnswer(DNo, answer);
	}

	@Override
	public void AddCase(Case cass) {
		// TODO Auto-generated method stub
		casedao.Add(cass);
		
	}

	@Override
	public void AddPrescription(Prescription pre) {
		// TODO Auto-generated method stub
		predao.Add(pre);
	}

	

	@Override
	public List<Registration> ShowReg(String DName) {
		// TODO Auto-generated method stub
		
		return rdao.FindByDNo(DName);
	}

	@Override
	public Patient AddPatient(Patient patient) {
		// TODO Auto-generated method stub
	
		 patdao.Add(patient);
		 
	     return patient;
	}

	@Override
	public List<Case> findCaseByDName(String DName) {
		// TODO Auto-generated method stub
	    return	casedao.findByNo(DName);
	}

	@Override
	public List<Case> findCaseById(String Id) {
		// TODO Auto-generated method stub
		return casedao.findById(Id);
	}

	@Override
	public List<Doctor> findalldoc() {
		// TODO Auto-generated method stub
		return doctordao.findalldoc();
	}

	@Override
	public void ModifyReg(String Rno, String Rstate) {
		// TODO Auto-generated method stub
		rdao.ModifyReg(Rno, Rstate);
	}

	@Override
	public Doctor showdoc(String DName) {
		// TODO Auto-generated method stub
		return doctordao.findById(DName);
	}

	

}
