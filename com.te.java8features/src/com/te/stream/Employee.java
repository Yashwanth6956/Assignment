package com.te.stream;

public class Employee {
	int employeeid;
	String employeeName;
	double salary;
	String designation;
	int age;
	

	@Override
	public String toString() {
		return "Employee [employeeid=" + employeeid + ", employeeName=" + employeeName + ", salary=" + salary
				+ ", designation=" + designation + ", age=" + age + "]";
	}

	public Employee(int employeeid, String employeeName, double salary, String designation, int age) {
		super();
		this.employeeid = employeeid;
		this.employeeName = employeeName;
		this.salary = salary;
		this.designation = designation;
		this.age = age;
	}

	public int getEmployeeid() {
		return employeeid;
	}

	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
