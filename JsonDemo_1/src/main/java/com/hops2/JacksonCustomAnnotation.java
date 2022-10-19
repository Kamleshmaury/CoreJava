package com.hops2;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import com.fasterxml.jackson.annotation.JacksonAnnotationsInside;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

@Retention(RetentionPolicy.RUNTIME)
@JacksonAnnotationsInside
@JsonInclude(value = Include.NON_NULL)
@JsonPropertyOrder({ "rollNo", "id", "name" })
@interface CustomAnnotation {

}

@CustomAnnotation
@JsonRootName("Student")
class CollegeStudent {
	int id;
	int rollNo;
	String name;

	public CollegeStudent(int id, int rollNo, String name) {
		this.id = id;
		this.rollNo = rollNo;
		this.name = name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public int getRollNo() {
		return rollNo;
	}

	@JsonGetter("StudentName : ")
	public String getName() {
		return name;
	}	
}

public class JacksonCustomAnnotation {
	public static void main(String[] args) {
		try {
			ObjectMapper mapper = new ObjectMapper();
			CollegeStudent student = new CollegeStudent(1, 13, "Mark");
			mapper.enable(SerializationFeature.WRAP_ROOT_VALUE);
			String jsonString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(student);
			System.out.println(jsonString);

		} catch (Exception ex) {
			System.out.println("Some error" + ex);
		}
	}

}
