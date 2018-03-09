package com.hospital.user.dao;

import java.util.List;

import com.hospital.user.model.Case;


public interface CaseDao {
	public void Add(Case cass);
	public List<Case> findByNo(String DName);
	public List<Case> findById(String Id);
}
