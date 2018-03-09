package com.hospital.user.dao;



import java.util.List;

import com.hospital.user.model.Staff;

public interface StaffDao {
	public void addStaff(Staff staff);
	public Staff findByNo(String sNo);
	public List<Staff> FindAll();
	public void DeleteStaff(String sNo);
}
