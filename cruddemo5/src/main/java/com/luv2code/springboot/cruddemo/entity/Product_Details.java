package com.luv2code.springboot.cruddemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="product_details")
public class Product_Details {
	@Id
	@Column
	private String Product_ID;
	@Column
	private String Product_Name;
	@Column
	private String Product_Details;
	@Column
	private int Product_Launch_Date;
	@Column
	private int Product_End_Date;
	@Override
	public String toString() {
		return "Product_Details [Product_ID=" + Product_ID + ", Product_Name=" + Product_Name + ", Product_Details="
				+ Product_Details + ", Product_Launch_Date=" + Product_Launch_Date + ", Product_End_Date="
				+ Product_End_Date + "]";
	}


}
