package com.hospital.user.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Message")
public class Message {
	
	@Id
	@Column(name="MeNo")
	protected int messageNo;
	@Column(name="Content")
	protected String content;
	@Column(name="DNo")
	protected String dNo;
	@Column(name="reply")
	protected String reply;

	public String getReply() {
		return reply;
	}
	public void setReply(String reply) {
		this.reply = reply;
	}
	public int getMessageNo() {
		return messageNo;
	}
	public void setMessageNo(int messageNo) {
		this.messageNo = messageNo;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getdNo() {
		return dNo;
	}
	public void setdNo(String dNo) {
		this.dNo = dNo;
	}

}
