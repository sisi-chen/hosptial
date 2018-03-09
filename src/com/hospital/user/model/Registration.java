package com.hospital.user.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="Registration")
public class Registration {
	
	@Id
	@Column(name="RNo")
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	protected int rNo;
	@Column(name="AOName")
	String aoName;//�Һ���ѡ��Ŀ���
	@Column(name="DNo")
	protected String dNo;//�Һ���ѡ���ҽ��
	@Column(name="RState")
	protected String rState;//�Һ�״̬
	
	public int getrNo() {
		return rNo;
	}
	public void setrNo(int rNo) {
		this.rNo = rNo;
	}
	public String getAoName() {
		return aoName;
	}
	public void setAoName(String aoName) {
		this.aoName = aoName;
	}
	public String getdNo() {
		return dNo;
	}
	public void setdNo(String dNo) {
		this.dNo = dNo;
	}
	public String getrState() {
		return rState;
	}
	public void setrState(String rState) {
		this.rState = rState;
	}
	
	
}
