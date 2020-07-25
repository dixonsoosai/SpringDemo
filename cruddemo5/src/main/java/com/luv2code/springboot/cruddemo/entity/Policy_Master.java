package com.luv2code.springboot.cruddemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "policy_master")
public class Policy_Master {
	@Id
	@Column
	private String Policy_Number;
	@Column
	private String Customer_ID;
	@Column
	private String Customer_Name;
	@Column
	private String Insured_Name;
	@Column(name= "DOB")
	private String DOB;
	@Column(name= "Email_Address")
	private String Email_Address;
	@Column(name= "Mobile_Number")
	private long Mobile_Number;
	@Column(name= "Premium_Mode")
	private String Premium_Mode;
	@Column(name= "Policy_Status")
	private String Policy_Status;
	@Column(name= "Customer_PAN_NO")
	private String Customer_PAN_NO;
	@Column(name= "Policy_Issuance_Date")
	private int Policy_Issuance_Date;
	@Column(name= "Contact_Number_Last_updated")
	private int Contact_Number_Last_updated;
	@Column(name= "Email_Address_Last_updated")
	private int Email_Address_Last_updated;
	@Column(name= "Bank_Account_Number")
	private String Bank_Account_Number;
	@Column(name= "whatsapp_opt_in_status")
	private String whatsapp_opt_in_status;
	@Column(name= "Product_Name")
	private String Product_Name;
	@Column(name= "Product_ID")
	private String Product_ID;
	@Column(name= "Reinvest_Applicable")
	private boolean Reinvest_Applicable;
	@Column(name= "Outstanding_Payout")
	private float Outstanding_Payout;
	@Column(name= "Unclaimed_Amount")
	private float Unclaimed_Amount;
	@Column(name= "NEFT_Registered")
	private boolean NEFT_Registered;
	@Column(name= "Last_Premium_Paid")
	private char Last_Premium_Paid;
	@Override
	public String toString() {
		return "Policy_Master [Policy_Number=" + Policy_Number + ", Customer_ID=" + Customer_ID + ", Customer_Name="
				+ Customer_Name + ", Insured_Name=" + Insured_Name + ", DOB=" + DOB + ", Email_Address=" + Email_Address
				+ ", Mobile_Number=" + Mobile_Number + ", Premium_Mode=" + Premium_Mode + ", Policy_Status="
				+ Policy_Status + ", Customer_PAN_NO=" + Customer_PAN_NO + ", Policy_Issuance_Date="
				+ Policy_Issuance_Date + ", Contact_Number_Last_updated=" + Contact_Number_Last_updated
				+ ", Email_Address_Last_updated=" + Email_Address_Last_updated + ", Bank_Account_Number="
				+ Bank_Account_Number + ", whatsapp_opt_in_status=" + whatsapp_opt_in_status + ", Product_Name="
				+ Product_Name + ", Product_ID=" + Product_ID + ", Reinvest_Applicable=" + Reinvest_Applicable
				+ ", Outstanding_Payout=" + Outstanding_Payout + ", Unclaimed_Amount=" + Unclaimed_Amount
				+ ", NEFT_Registered=" + NEFT_Registered + ", Last_Premium_Paid=" + Last_Premium_Paid + "]";
	}
	public String getPolicy_Number() {
		return Policy_Number;
	}
	public void setPolicy_Number(String policy_Number) {
		Policy_Number = policy_Number;
	}
	public String getCustomer_ID() {
		return Customer_ID;
	}
	public void setCustomer_ID(String customer_ID) {
		Customer_ID = customer_ID;
	}
	public String getCustomer_Name() {
		return Customer_Name;
	}
	public void setCustomer_Name(String customer_Name) {
		Customer_Name = customer_Name;
	}
	public String getInsured_Name() {
		return Insured_Name;
	}
	public void setInsured_Name(String insured_Name) {
		Insured_Name = insured_Name;
	}
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String dOB) {
		DOB = dOB;
	}
	public String getEmail_Address() {
		return Email_Address;
	}
	public void setEmail_Address(String email_Address) {
		Email_Address = email_Address;
	}
	public long getMobile_Number() {
		return Mobile_Number;
	}
	public void setMobile_Number(long mobile_Number) {
		Mobile_Number = mobile_Number;
	}
	public String getPremium_Mode() {
		return Premium_Mode;
	}
	public void setPremium_Mode(String premium_Mode) {
		Premium_Mode = premium_Mode;
	}
	public String getPolicy_Status() {
		return Policy_Status;
	}
	public void setPolicy_Status(String policy_Status) {
		Policy_Status = policy_Status;
	}
	public String getCustomer_PAN_NO() {
		return Customer_PAN_NO;
	}
	public void setCustomer_PAN_NO(String customer_PAN_NO) {
		Customer_PAN_NO = customer_PAN_NO;
	}
	public int getPolicy_Issuance_Date() {
		return Policy_Issuance_Date;
	}
	public void setPolicy_Issuance_Date(int policy_Issuance_Date) {
		Policy_Issuance_Date = policy_Issuance_Date;
	}
	public int getContact_Number_Last_updated() {
		return Contact_Number_Last_updated;
	}
	public void setContact_Number_Last_updated(int contact_Number_Last_updated) {
		Contact_Number_Last_updated = contact_Number_Last_updated;
	}
	public int getEmail_Address_Last_updated() {
		return Email_Address_Last_updated;
	}
	public void setEmail_Address_Last_updated(int email_Address_Last_updated) {
		Email_Address_Last_updated = email_Address_Last_updated;
	}
	public String getBank_Account_Number() {
		return Bank_Account_Number;
	}
	public void setBank_Account_Number(String bank_Account_Number) {
		Bank_Account_Number = bank_Account_Number;
	}
	public String getWhatsapp_opt_in_status() {
		return whatsapp_opt_in_status;
	}
	public void setWhatsapp_opt_in_status(String whatsapp_opt_in_status) {
		this.whatsapp_opt_in_status = whatsapp_opt_in_status;
	}
	public String getProduct_Name() {
		return Product_Name;
	}
	public void setProduct_Name(String product_Name) {
		Product_Name = product_Name;
	}
	public String getProduct_ID() {
		return Product_ID;
	}
	public void setProduct_ID(String product_ID) {
		Product_ID = product_ID;
	}
	public boolean isReinvest_Applicable() {
		return Reinvest_Applicable;
	}
	public void setReinvest_Applicable(boolean reinvest_Applicable) {
		Reinvest_Applicable = reinvest_Applicable;
	}
	public float getOutstanding_Payout() {
		return Outstanding_Payout;
	}
	public void setOutstanding_Payout(float outstanding_Payout) {
		Outstanding_Payout = outstanding_Payout;
	}
	public float getUnclaimed_Amount() {
		return Unclaimed_Amount;
	}
	public void setUnclaimed_Amount(float unclaimed_Amount) {
		Unclaimed_Amount = unclaimed_Amount;
	}
	public boolean isNEFT_Registered() {
		return NEFT_Registered;
	}
	public void setNEFT_Registered(boolean nEFT_Registered) {
		NEFT_Registered = nEFT_Registered;
	}
	public char getLast_Premium_Paid() {
		return Last_Premium_Paid;
	}
	public void setLast_Premium_Paid(char last_Premium_Paid) {
		Last_Premium_Paid = last_Premium_Paid;
	}
	
	

}
