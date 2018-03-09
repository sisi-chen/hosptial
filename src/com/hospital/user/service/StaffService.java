package com.hospital.user.service;

import java.util.List;

import com.hospital.user.model.CheckIO;
import com.hospital.user.model.ConsumeByClass;
import com.hospital.user.model.Medicine;



public interface StaffService {
	public Medicine add(Medicine m);
	public Medicine search(String Mname);
	public void deleteMedicine(String Mname);
	public void Consume(String mname,int num);
	public List<ConsumeByClass> countConsume();

	public void AddCheckIO(CheckIO checkio);
	public void DeleteCheckIO(String hosNo);
	public List<CheckIO> FindAllCheckIO();
	public CheckIO FindCheckIOByNo(String hosNo);

}
