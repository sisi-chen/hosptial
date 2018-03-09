package com.hospital.user.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Doctor")
public class Doctor {
	
	@Id
	@Column(name="DNo")
	protected String dno;
	@Column(name="DRank")
	protected String dRank;//医生的职称
	@Column(name="AOName")
	protected String aoName;//医生所属的科室
	@Column(name="DName")
	protected String dname;
	@Column(name="Sex")
	protected String dSex;
	@Column(name="Tel")
	protected String dTel;
	@Column(name="Age")
	protected String dAge;
	@Column(name="State")
	protected String dState;//医生的状态，离职还是在职
	
	
	public String getDno() {
		return dno;
	}
	public void setDno(String dno) {
		this.dno = dno;
	}
	public String getdRank() {
		return dRank;
	}
	public void setdRank(String dRank) {
		this.dRank = dRank;
	}
	public String getAoName() {
		return aoName;
	}
	public void setAoName(String aoName) {
		this.aoName = aoName;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getdSex() {
		return dSex;
	}
	public void setdSex(String dSex) {
		this.dSex = dSex;
	}
	public String getdTel() {
		return dTel;
	}
	public void setdTel(String dTel) {
		this.dTel = dTel;
	}
	public String getdAge() {
		return dAge;
	}
	public void setdAge(String dAge) {
		this.dAge = dAge;
	}
	public String getdState() {
		return dState;
	}
	public void setdState(String dState) {
		this.dState = dState;
	}
}
