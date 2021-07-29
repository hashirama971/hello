package com.example.demo.tablename;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "student")
public class Student {

	@Id
	@Column
	int studid;
	@Column
	String studname;
	@Column
	int balance;

	public Student() {
	}

	public Student(int studid, String studname, int balance) {
		super();
		this.studid = studid;
		this.studname = studname;
		this.balance = balance;
	}

	public int getStudid() {
		return studid;
	}

	public void setStudid(int studid) {
		this.studid = studid;
	}

	public String getStudname() {
		return studname;
	}

	public void setStudname(String studname) {
		this.studname = studname;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

}
