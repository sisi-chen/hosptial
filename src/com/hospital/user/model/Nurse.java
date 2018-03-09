package com.hospital.user.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Nurse")
public class Nurse {
	@Id
	@Column(name="NNo")
	protected String nNo;
	@Column(name="NRank")
	protected String nRank;//护士的职称
	@Column(name="AOName")
	protected String aoName;//护士所属的科室
	@Column(name="NName")
	protected String nName;
	@Column(name="Sex")
	protected String nSex;
	@Column(name="Tel")
	protected String nTel;
	@Column(name="Age")
	protected String nAge;
	@Column(name="HNo")
	protected String hNo;//护士所属的病房
	
	
	
	public String getnNo() {
		return nNo;
	}
	public void setnNo(String nNo) {
		this.nNo = nNo;
	}
	public String getnRank() {
		return nRank;
	}
	public void setnRank(String nRank) {
		this.nRank = nRank;
	}
	public String getAoName() {
		return aoName;
	}
	public void setAoName(String aoName) {
		this.aoName = aoName;
	}
	public String getnName() {
		return nName;
	}
	public void setnName(String nName) {
		this.nName = nName;
	}
	public String getnSex() {
		return nSex;
	}
	public void setnSex(String nSex) {
		this.nSex = nSex;
	}
	public String getnTel() {
		return nTel;
	}
	public void setnTel(String nTel) {
		this.nTel = nTel;
	}
	public String getnAge() {
		return nAge;
	}
	public void setnAge(String nAge) {
		this.nAge = nAge;
	}
	public String gethNo() {
		return hNo;
	}
	public void sethNo(String hNo) {
		this.hNo = hNo;
	}
	
}

