package com.hospital.user.dao;

import java.util.List;

import com.hospital.user.model.CheckIO;

public interface CheckIODao {
	public List<CheckIO> FindAllCheckIO();
	public void AddCheckIO(CheckIO checkio);
	public CheckIO FindByNo(String hosNo);
	public void DeleteCheckIO(String hosNo);
}
