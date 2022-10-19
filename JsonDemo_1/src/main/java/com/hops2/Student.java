package com.hops2;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;

public class Student {
	
	Map<String, String> map;
	
	public Student() {
		map = new HashMap<>();
	}
	
	@JsonAnyGetter
	public Map<String,String> getStudents(){
		return map;
	}

	public void add(String name, String value) {
		map.put(name, value);
	}
}
