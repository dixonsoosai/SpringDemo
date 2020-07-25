package com.luv2code.springboot.cruddemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "otp_log")
public class OTP_Log {

	@Id
	@Column
	private int Mobile_number;
	@Column
	private int OTP;
	@Column
	private int Expire_Time;
	@Column
	private int Created_TIme;
	@Override
	public String toString() {
		return "OTP_Log [Mobile_number=" + Mobile_number + ", OTP=" + OTP + ", Expire_Time=" + Expire_Time
				+ ", Created_TIme=" + Created_TIme + "]";
	}
}
