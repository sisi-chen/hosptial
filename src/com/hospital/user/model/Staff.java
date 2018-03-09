package com.hospital.user.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Staff")
public class Staff {
	@Id
	@Column(name="SNo")
	protected String sNo;//工作人员的编号
	@Column(name="SName")
	protected String sName;
	@Column(name="Sex")
	protected String sSex;
	@Column(name="Age")
	protected String sAge;
	@Column(name="Tel")
	protected String sTel;
	@Column(name="State")
	protected String sState;//工作人员的状态
	public String getsNo() {
		return sNo;
	}
	public void setsNo(String sNo) {
		this.sNo = sNo;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getsSex() {
		return sSex;
	}
	public void setsSex(String sSex) {
		this.sSex = sSex;
	}
	public String getsAge() {
		return sAge;
	}
	public void setsAge(String sAge) {
		this.sAge = sAge;
	}
	public String getsTel() {
		return sTel;
	}
	public void setsTel(String sTel) {
		this.sTel = sTel;
	}
	public String getsState() {
		return sState;
	}
	public void setsState(String sState) {
		this.sState = sState;
	}
}

