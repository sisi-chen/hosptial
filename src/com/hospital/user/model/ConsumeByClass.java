package com.hospital.user.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="consumeByClass")
public class ConsumeByClass {
	@Id
	@Column(name="medicineclass")
	protected String medcineclass;
	@Column(name="consume")
	protected int consume;
	public String getMedcineclass() {
		return medcineclass;
	}
	public void setMedcineclass(String medcineclass) {
		this.medcineclass = medcineclass;
	}
	public int getConsume() {
		return consume;
	}
	public void setConsume(int consume) {
		this.consume = consume;
	}

}
