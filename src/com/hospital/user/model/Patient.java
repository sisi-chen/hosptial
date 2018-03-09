package com.hospital.user.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Patient")
public class Patient {
	
	@Id
	@Column(name = "pNo")
	protected String pNo;
	@Column(name = "pName")
	protected String pName;
	@Column(name = "Sex")
	protected String Sex;
	@Column(name = "Tel")
	protected String Tel;
	@Column(name = "HNo")
	protected String HNo;
	@Column(name = "Addr")
	protected String Addr;
	@Column(name = "IdCard")
	protected String IdCard;
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
	public String getSex() {
		return Sex;
	}
	public void setSex(String sex) {
		Sex = sex;
	}
	public String getTel() {
		return Tel;
	}
	public void setTel(String tel) {
		Tel = tel;
	}
	public String getHNo() {
		return HNo;
	}
	public void setHNo(String hNo) {
		HNo = hNo;
	}
	public String getAddr() {
		return Addr;
	}
	public void setAddr(String addr) {
		Addr = addr;
	}
	public String getIdCard() {
		return IdCard;
	}
	public void setIdCard(String idCard) {
		IdCard = idCard;
	}

}
