package com.chainsys.miniproject.pojo;

import java.util.Date;

public class Doctor {

	private int Doct_ID; 
	private String Doct_Name;    
	private Date DOB;                         
	private String Speciality;    
	private String City;                
	private long Phone_No;     
	private float Standard_Fees;         
	
	public int getDoct_ID() {
		return Doct_ID;
	}
	public void setDoct_ID(int doct_ID) {
		this.Doct_ID = doct_ID;
	}
	
	public String getDoct_Name() {
		return Doct_Name;
	}
	public void setDoct_Name(String doct_Name) {
		this.Doct_Name = doct_Name;
	}
	
	public Date getDOB() {
		return DOB;
	}
	public void setDOB(Date dOB) {
		this.DOB = dOB;
	}
	
	public String getSpeciality() {
		return Speciality;
	}
	
	public void setSpeciality(String speciality) {
		this.Speciality = speciality;
	}
	
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		this.City = city;
	}
	
	public long getPhone_No() {
		return Phone_No;
	}
	public void setPhone_No(long phone_No) {
		this.Phone_No = phone_No;
	}
	
	public float getStandard_Fees() {
		return Standard_Fees;
	}
	public void setStandard_Fees(Float std_fees) {
		this.Standard_Fees = std_fees;
	}
	
}