package com.hospital.user.dao;

import java.util.List;

import com.hospital.user.model.ConsumeByClass;
import com.hospital.user.model.Medicine;

public interface MedicineDao {
	public Medicine add(Medicine m);
	public void addConsume(String mname,int num);
	public List<ConsumeByClass> countConsume();
	public Medicine findByName(String Mname);
	public void deleteByName(String Mname);

}
