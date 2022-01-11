package com.te.stream;

public class Student {
	int id;
	String name;
	int marks;
	String section;
	
	public Student(int id, String name, int marks, String section) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.section = section;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + ", section=" + section + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	
	
	
	
	
	
	
}
