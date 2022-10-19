package com.hops2;

import com.fasterxml.jackson.annotation.JacksonInject;
import com.fasterxml.jackson.databind.InjectableValues;
import com.fasterxml.jackson.databind.ObjectMapper;

class Employee
{
	
	public String name;
	@JacksonInject
	public int rollNo;
}
public class JacksonInjectAnno {
	public static void main(String[] args) {
		String json = "{\"name\":\"Rahul\"}"; 
		InjectableValues values = new InjectableValues.Std().addValue(int.class, 101);
		ObjectMapper mapper = new ObjectMapper();
		try
		{
			Employee emp = mapper.reader(values).forType(Employee.class).readValue(json);
			System.out.println(emp.name+" , "+emp.rollNo);
		}
		catch(Exception ex) {
			System.out.println(ex);
		}
	}

}
