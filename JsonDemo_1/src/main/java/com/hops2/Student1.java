package com.hops2;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"Name","rollNo"})
public class Student1 {
	private String name;
	private int rollNo;

	public Student1(String name, int rollNo) {
		this.name = name;
		this.rollNo = rollNo;
	}

	@JsonGetter("Name")
	public String getStudentName() {
		return name;
	}

	public int getRollNo() {
		return rollNo;
	}

	@Override
	public String toString() {
		return "Student1 [name=" + name + ", rollNo=" + rollNo + "]";
	}
	
	

}
