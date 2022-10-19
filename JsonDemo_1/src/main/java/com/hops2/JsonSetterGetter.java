package com.hops2;

import java.io.IOException;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.ObjectMapper;

@JsonPropertyOrder({"Name"})
class Person
{
	String personName;
	int personId;
	
	public Person(String personName, int personId) {
		super();
		this.personName = personName;
		this.personId = personId;
	}

	@JsonGetter("Name")
	public String getPersonName() {
		return personName;
	}

	@JsonSetter("name")
	public void setPersonName(String personName) {
		this.personName = personName;
	}

}
public class JsonSetterGetter {
	public static void main(String[] args) {
		try
		{
			ObjectMapper mapper = new ObjectMapper();
			Person p1 = new Person("Ramu", 101);
			//String json = "{\"personId\":101,\"name\":\"Ramu\"}";
			//Person p1 = mapper.readerFor(Person.class).readValue(json);
			//System.out.println(p1.personId+":"+p1.personName);
			String str = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(p1);
			System.out.println(str);
			
			
			
		}
		catch(Exception ex) {
			System.out.println("Some problem "+ex);
		}
		
	}

}
