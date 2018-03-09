package com.hospital.user.service;

import java.util.List;

import com.hospital.user.model.Case;
import com.hospital.user.model.Doctor;
import com.hospital.user.model.Patient;
import com.hospital.user.model.Prescription;
import com.hospital.user.model.Registration;

public interface DoctorService {
	public Patient  AddPatient(Patient patient);
	public void  AnswerMessage(String DNo,String answer);
	public void  AddCase(Case cass);
	public void  AddPrescription(Prescription pre);
	public List<Case>  findCaseByDName(String DName);
	public List<Case>  findCaseById(String Id);
	public List<Registration> ShowReg(String DName);
	public List<Doctor> findalldoc();
	public void ModifyReg(String Rno, String Rstate);
	public Doctor showdoc(String DName);
}
