package com.luv2code.springboot.cruddemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "status_codes")
public class Status_Codes {

	@Id
	@Column(name = "code")
	private String code;
	@Column(name= "description")
	private String Description;
	@Override
	public String toString() {
		return "Status_Code [code=" + code + ", Description=" + Description + "]";
	}

	
	
}
