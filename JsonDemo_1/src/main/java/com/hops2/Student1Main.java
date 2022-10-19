package com.hops2;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Student1Main {
	public static void main(String[] args) {
		ObjectMapper mapper = new ObjectMapper();
		try {
			Student1 s1 = new Student1("Rahul", 1);
			Student1 s2 = new Student1("ravi", 2);
			List<Student1> list = new ArrayList<>();
			list.add(s1);
			list.add(s2);
			String jsonString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(list);
			System.out.println(jsonString);
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
