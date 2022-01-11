package com.te.hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;


public class Team {
	@Id
	private int eid;
	@Override
	public String toString() {
		return "Team [eid=" + eid + ", name=" + name + ", salary=" + salary + ", designation=" + designation + "]";
	}

	private String name;
	private int salary;
	private String designation;

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}


}
