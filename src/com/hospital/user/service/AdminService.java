package com.hospital.user.service;

import java.util.List;

import com.hospital.user.model.Logistic;
import com.hospital.user.model.Doctor;
import com.hospital.user.model.Nurse;
import com.hospital.user.model.Staff;

public interface AdminService{
	public List<Staff> FindAll();
	public void AddStaff(Staff staff);
	public Staff FindStaffByNo(String sNo);
	public void DeleteStaff(String sNo);
	
	public List<Doctor> FindAllDoctor();
	public void AddDoctor(Doctor doctor);
	public void DeleteDoctor(String dNo);
	public Doctor FindDoctorByNo(String dNo);
	public Doctor SearchDoctor(String dNo);
	public boolean ModifyState(String dNo);
	
	public List<Nurse> FindAllNurse();
	public Nurse FindNurseByNo(String nNo);
	public void DeleteNurse(String nNo);
	public void AddNurse(Nurse nurse);
	
	public List<Logistic> FindAllLogistic();
	public void AddLogistic(Logistic logistic);
	public void DeleteLogistic(String lNo);
	public Logistic FindLogisticByNo(String lNo);
}
