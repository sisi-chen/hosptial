package com.hospital.user.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Medicine")
public class Medicine {
	@Id
	@Column(name="MName")
	protected String mName;
	@Column(name="Mclass")
	protected String mClass;
	@Column(name="MNum")
	protected int mNum;
	@Column(name="Consume")
	protected int consume;
	public int getConsume() {
		return consume;
	}
	public void setConsume(int consume) {
		this.consume = consume;
	}
	protected String spc;//药品的规格
	public String getmName() {
		return mName;
	}
	public void setmName(String mName) {
		this.mName = mName;
	}
	public String getmClass() {
		return mClass;
	}
	public void setmClass(String mClass) {
		this.mClass = mClass;
	}
	public int getmNum() {
		return mNum;
	}
	public void setmNum(int mNum) {
		this.mNum = mNum;
	}
	public String getSpc() {
		return spc;
	}
	public void setSpc(String spc) {
		this.spc = spc;
	}
	
}
