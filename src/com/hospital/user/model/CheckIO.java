package com.hospital.user.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="CheckIO")
public class CheckIO {
	@Id
	@Column(name="hosNo")
	protected String hosNo;
	@Column(name="hNo")
	protected String hNo;
	@Column(name="age")
	protected String age;
	@Column(name="family")
	protected String family;
	@Column(name="FTel")
	protected String fTel;
	@Column(name="Tel")
	protected String selfTel;
	@Column(name="ill")
	protected String ill;
	@Column(name="ClDate")
	protected String clDate;//入院时间
	@Column(name="CoDate")
	protected String cODate;//出院时间
	public String getHosNo() {
		return hosNo;
	}
	public void setHosNo(String hosNo) {
		this.hosNo = hosNo;
	}
	public String gethNo() {
		return hNo;
	}
	public void sethNo(String hNo) {
		this.hNo = hNo;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getFamily() {
		return family;
	}
	public void setFamily(String family) {
		this.family = family;
	}
	public String getfTel() {
		return fTel;
	}
	public void setfTel(String fTel) {
		this.fTel = fTel;
	}
	public String getSelfTel() {
		return selfTel;
	}
	public void setSelfTel(String selfTel) {
		this.selfTel = selfTel;
	}
	public String getIll() {
		return ill;
	}
	public void setIll(String ill) {
		this.ill = ill;
	}
	public String getClDate() {
		return clDate;
	}
	public void setclDate(String clDate) {
		this.clDate = clDate;
	}
	public String getcODate() {
		return cODate;
	}
	public void setcODate(String cODate) {
		this.cODate = cODate;
	}
	
	
}
	