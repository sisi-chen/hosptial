package com.hospital.user.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital.user.dao.DoctorDao;
import com.hospital.user.dao.LogisticDao;
import com.hospital.user.dao.NurseDao;
import com.hospital.user.dao.StaffDao;
import com.hospital.user.model.Doctor;
import com.hospital.user.model.Logistic;
import com.hospital.user.model.Nurse;
import com.hospital.user.model.Staff;

@Service
@Transactional
public class AdminServiceImpl  implements AdminService{

	@Autowired
	protected StaffDao staffdao;
	@Autowired
	protected DoctorDao doctordao;
	@Autowired
	protected NurseDao nursedao;
	@Autowired
	protected LogisticDao logisticdao;
	@Override
	public List<Staff> FindAll() {
		// TODO Auto-generated method stub
		return staffdao.FindAll();
	}

	@Override
	public List<Doctor> FindAllDoctor() {
		
		return doctordao.FindAllDoctor();
	}

	@Override
	public List<Nurse> FindAllNurse() {
		// TODO Auto-generated method stub
		return nursedao.FindAllNurse();
	}

	@Override
	public List<Logistic> FindAllLogistic() {
		// TODO Auto-generated method stub
		return logisticdao.FindAllLogistic();
	}

	@Override
	public void AddNurse(Nurse nurse) {
		// TODO Auto-generated method stub
		nursedao.AddNurse(nurse);
	}

	@Override
	public void AddDoctor(Doctor doctor) {
		// TODO Auto-generated method stub
		doctordao.AddDoctor(doctor);
	}

	@Override
	public void AddStaff(Staff staff) {
		staffdao.addStaff(staff);
		
	}

	@Override
	public void AddLogistic(Logistic logistic) {
		logisticdao.AddLogistic(logistic);
		
	}

	@Override
	public Nurse FindNurseByNo(String nNo) {
		
		return nursedao.FindByNo(nNo);
	}

	@Override
	public void DeleteNurse(String nNo) {
		nursedao.DeleteNurse(nNo);
	}

	@Override
	public Staff FindStaffByNo(String sNo) {
		return staffdao.findByNo(sNo);
	}

	@Override
	public void DeleteStaff(String sNo) {
		staffdao.DeleteStaff(sNo);
		
	}

	@Override
	public void DeleteDoctor(String dNo) {

		doctordao.DeleteDoctor(dNo);
		
	}

	@Override
	public Doctor FindDoctorByNo(String dNo) {
		return doctordao.findById(dNo);
	}

	@Override
	public void DeleteLogistic(String lNo) {
		logisticdao.DeleteLogistic(lNo);
		
	}

	@Override
	public Logistic FindLogisticByNo(String lNo) {
		return logisticdao.FindLogisticByNo(lNo);
	}

	@Override
	public Doctor SearchDoctor(String dNo) {
		return doctordao.SearchDoctor(dNo);
	}

	@Override
	public boolean ModifyState(String dNo) {
		return doctordao.ModifyState(dNo);
	}

	

	

}
