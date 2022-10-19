package com.hops2;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;

class Student6 {

	int id;
	int rollNo;

	@JsonFilter("nameFilter")
	@JsonProperty("Stdname")
	String name;

	public Student6(int id, int rollNo, String name) {
		super();
		this.id = id;
		this.rollNo = rollNo;
		this.name = name;
	}

}

public class JsonFilterTest {
	public static void main(String[] args) {
		ObjectMapper mapper = new ObjectMapper();
		Student6 s6 = new Student6(1, 354, "Rohan");
		SimpleFilterProvider sfp = new SimpleFilterProvider();
		sfp.addFilter("nameFilter", SimpleBeanPropertyFilter.filterOutAllExcept("Stdname"));
		try {
			mapper.setFilterProvider(sfp);
			String str = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(s6);
			System.out.println(str);
		} catch (JsonProcessingException e) {

			e.printStackTrace();
		}
	}

}
