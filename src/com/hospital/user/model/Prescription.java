package com.hospital.user.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Prescription")
public class Prescription {
	@Id
	@Column(name = "PrNo")
	protected String prNo;
	@Column(name = "pNo")
	protected String pNo;
	@Column(name = "PName")
	protected String pName;
	@Column(name = "MName")
	protected String MName;//使用的药品名称及数量
	@Column(name = "DName")
	protected String dName;
	@Column(name = "DDate")
	protected String date;
	public String getPrNo() {
		return prNo;
	}
	public void setPrNo(String prNo) {
		this.prNo = prNo;
	}
	public String getpNo() {
		return pNo;
	}
	public void setpNo(String pNo) {
		this.pNo = pNo;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}

	public String getMName() {
		return MName;
	}
	public void setMName(String mName) {
		MName = mName;
	}
	public String getdName() {
		return dName;
	}
	public void setdName(String dName) {
		this.dName = dName;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
}
