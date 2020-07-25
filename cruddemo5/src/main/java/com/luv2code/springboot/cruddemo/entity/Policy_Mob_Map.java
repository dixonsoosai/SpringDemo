package com.luv2code.springboot.cruddemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "policy_mob_map")
public class Policy_Mob_Map {
	
	@Id
	@Column
	private String Optin_ID;
	@Column
	private long Mobile_Number;
	@Column
	private String Policy_Number;
	@Column
	private String Optin_Date;
	@Override
	public String toString() {
		return "Policy_Mob_Map [Optin_ID=" + Optin_ID + ", Mobile_Number=" + Mobile_Number + ", Policy_Number="
				+ Policy_Number + ", Optin_Date=" + Optin_Date + "]";
	}
	
	
}
