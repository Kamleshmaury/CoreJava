package com.hops2;

import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

class A
{
	int id;
	String name;
	public A(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}

	@JsonValue
	public String toString() {
		return "A {id=" + id + ", name=" + name + "}";
	}
	
}
public class JsonValueAnno {
	public static void main(String[] args) throws JsonProcessingException {
		ObjectMapper mapper = new ObjectMapper();
		A a1 = new A(101, "demo");
		String s1 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(a1);
		System.out.println(s1);
	}

}
