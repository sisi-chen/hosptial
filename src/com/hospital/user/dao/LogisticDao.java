package com.hospital.user.dao;

import java.util.List;

import com.hospital.user.model.Logistic;

public interface LogisticDao {
	public List<Logistic> FindAllLogistic();
	public void AddLogistic(Logistic lofistic);
	public void DeleteLogistic(String lNo);
	public Logistic FindLogisticByNo(String lNo);
}
