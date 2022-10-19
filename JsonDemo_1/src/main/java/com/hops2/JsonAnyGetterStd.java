package com.hops2;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonAnyGetterStd {
	public static void main(String[] args) {
		ObjectMapper mapper = new ObjectMapper();
		Student s1 = new Student();
		s1.add("ram", "456");
		s1.add("shyam", "6");
		
		try {
			String str = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(s1);
			System.out.println(str);
		} 
		catch (JsonProcessingException e) {
			e.printStackTrace();
		}
	}

}
