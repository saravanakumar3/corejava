package com.chainsys.classandmethods;

public class Employee {
	/**
	 * This a class that contains employee related data
	 * the person has id,name,city,and salary properties
	 * @author berl3129
	 *created on:25 march 2022
	 */

	
	private final int empID;
	public String name;
	private String city;
	public int salary;
	//constructor
	public Employee(int id)
	{
	        //assigning value to read only field
	        this.empID=id;
	}
	public String getName() {
	        return name;
	}
	public  void setName(String name) {
	        this.name=name;
	}
	public int getEmpId()
	{
	        return empID;
	}
	public String getCity() {
	        return city;
	}
	public void setCity(String city) {
	        this.city=city;
	}
	public long getSalary() {
	        return salary; 
	}
	public void setSalary(long salary) {
	       salary=this.salary;
	}
}
