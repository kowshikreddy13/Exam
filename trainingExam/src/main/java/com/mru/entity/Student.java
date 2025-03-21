package com.mru.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
	private int RollNo;
	private String Name;
	private String Email;
	private String Branch;
	private String Year;
	public int getRollNo() {
		return RollNo;
	}
	public void setRollNo(int rollNo) {
		RollNo = rollNo;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getBranch() {
		return Branch;
	}
	public void setBranch(String branch) {
		Branch = branch;
	}
	public String getYear() {
		return Year;
	}
	public void setYear(String year) {
		Year = year;
	}
	@Override
	public String toString() {
		return "MRUEntity2 [RollNo=" + RollNo + ", Name=" + Name + ", Email=" + Email + ", Branch=" + Branch + ", Year="
				+ Year + "]";
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int rollNo, String name, String email, String branch, String year) {
		super();
		RollNo = rollNo;
		Name = name;
		Email = email;
		Branch = branch;
		Year = year;
	}
	
}
