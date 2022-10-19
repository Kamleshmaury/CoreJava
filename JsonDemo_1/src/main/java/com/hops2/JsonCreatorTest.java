package com.hops2;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;

class Student5
{
	String name;
	int rollNo;
	
	@JsonCreator
	public Student5(@JsonProperty("theName") String name,@JsonProperty("id") int rollNo) {
		this.name = name;
		this.rollNo = rollNo;
	}
}

public class JsonCreatorTest {
	public static void main(String[] args) {
		try {
			String json = "{\"id\":1,\"theName\":\"ravi\"}"; 
			ObjectMapper mapper = new ObjectMapper();
			Student5 st = mapper.readerFor(Student5.class).readValue(json);
			System.out.println(st.name+" ,"+st.rollNo);
		}
		catch(Exception ex) {
			System.out.println(ex);
		}
	}

}
