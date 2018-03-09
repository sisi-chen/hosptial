package com.hospital.user.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Case1")
public class Case {
	
	@Id
	@Column(name="cNo")
	protected String cNo;
	@Column(name="Ill")
	protected String ill;//���߲����еĲ�֢
	@Column(name="PName")
	protected String pName;//�ò��������Ļ���
	@Column(name="DName")
	protected String dName;
	@Column(name="CaDate")
	protected String date;//�ò�����д������
	@Column(name="History")
	protected String history;//�û����Ƿ��в�ʷ�Լ���ʷ���
	@Column(name="IdCard")
	protected String idCard;
	public String getcNo() {
		return cNo;
	}
	public void setcNo(String cNo) {
		this.cNo = cNo;
	}
	public String getIll() {
		return ill;
	}
	public void setIll(String ill) {
		this.ill = ill;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
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
	public String getHistory() {
		return history;
	}
	public void setHistory(String history) {
		this.history = history;
	}
	public String getIdCard() {
		return idCard;
	}
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}
	
	
}
