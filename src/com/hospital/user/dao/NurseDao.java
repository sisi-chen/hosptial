package com.hospital.user.dao;

import java.util.List;

import com.hospital.user.model.Nurse;

public interface NurseDao {
	public List<Nurse> FindAllNurse();
	public void AddNurse(Nurse nurse);
	public void DeleteNurse(String nNo);
	public Nurse FindByNo(String nNo);

}
