package com.example.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.techno.Technologies;

@Component

public class Customer {
	private String custname;
	private String coursename;
	private int custid;

	@Autowired
	  public Technologies techdetail; public Technologies getTechdetail() { return
	  techdetail; } public void setTechdetail(Technologies techdetail) {
	 this.techdetail = techdetail; }
	 
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	public int getCustid() {
		return custid;
	}
	public void setCustid(int custid) {
		this.custid = custid;
	}
	public void display()
	{
		System.out.println("inside customer class");
		techdetail.display();
	}
		
	
	

}
