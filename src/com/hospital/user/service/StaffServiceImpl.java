package com.hospital.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hospital.user.dao.MedicineDao;
import com.hospital.user.dao.CheckIODao;
import com.hospital.user.dao.PrescriptionDao;
import com.hospital.user.model.CheckIO;
import com.hospital.user.model.ConsumeByClass;
import com.hospital.user.model.Medicine;
import com.hospital.user.model.Patient;
@Service
@Transactional
public class StaffServiceImpl implements  StaffService{
	@Autowired
	private MedicineDao md;
	@Autowired
	private CheckIODao checkiodao;

	@Override
	public Medicine add(Medicine m) {
		
		return md.add(m);
	}



	@Override
	public void Consume(String mname, int num) {
		md.addConsume(mname, num);
		
	}

	@Override
	public List<ConsumeByClass> countConsume() {
		// TODO Auto-generated method stub
		return md.countConsume();
	}

	@Override
	public Medicine search(String Mname) {
		// TODO Auto-generated method stub
		return md.findByName(Mname);
	}

	@Override
	public void deleteMedicine(String Mname) {
		md.deleteByName(Mname);
		}



	@Override
	public void AddCheckIO(CheckIO checkio) {

		 checkiodao.AddCheckIO(checkio);
	}



	@Override
	public void DeleteCheckIO(String hosNo) {
		checkiodao.DeleteCheckIO(hosNo);
		
	}



	@Override
	public List<CheckIO> FindAllCheckIO() {
		
		return checkiodao.FindAllCheckIO();
	}



	@Override
	public CheckIO FindCheckIOByNo(String hosNo) {
		
		return checkiodao.FindByNo(hosNo);
	}

	

}
