package com.hops1;

import java.io.File;
import java.util.Map;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonPreetyPrinter {
	public static void main(String[] args) {
		try
		{
			ObjectMapper mapper = new ObjectMapper();
			//read data from json file
			Map<String,Object> map = mapper.readValue(new File("car.json"), new TypeReference<Map<String,Object>>() {
			});
			//convert object to string
			String str = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(map);
			System.out.println(str);
		}
		catch(Exception ex) {
			System.out.println(ex);
		}
		
	}

}
