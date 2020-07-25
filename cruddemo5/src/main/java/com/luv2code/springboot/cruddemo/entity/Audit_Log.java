package com.luv2code.springboot.cruddemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "audit_log")
public class Audit_Log {

	@Id
	@Column
	private String log;
	@Column
	private String log_date;
	@Override
	public String toString() {
		return "Audit_Log [log=" + log + ", log_date=" + log_date + "]";
	}
}
