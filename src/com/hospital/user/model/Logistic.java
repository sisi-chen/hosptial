package com.hospital.user.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="logistic")
public class Logistic {
	@Id
	@Column(name="Lno")
	protected String lNo;
	@Column(name="Lname")
	protected String lName;
	@Column(name="Ano")
	protected String aNo;//后勤人员所负责的辖区编号
	@Column(name="Sex")
	protected String lSex;
	@Column(name="Tel")
	protected String lTel;
	@Column(name="Age")
	protected String lAge;
	@Column(name="State")
	protected String lState;//后勤人员的状态
	public String getlNo() {
		return lNo;
	}
	public void setlNo(String lNo) {
		this.lNo = lNo;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getaNo() {
		return aNo;
	}
	public void setaNo(String aNo) {
		this.aNo = aNo;
	}
	public String getlSex() {
		return lSex;
	}
	public void setlSex(String lSex) {
		this.lSex = lSex;
	}
	public String getlTel() {
		return lTel;
	}
	public void setlTel(String lTel) {
		this.lTel = lTel;
	}
	public String getlAge() {
		return lAge;
	}
	public void setlAge(String lAge) {
		this.lAge = lAge;
	}
	public String getlState() {
		return lState;
	}
	public void setlState(String lState) {
		this.lState = lState;
	}
}
