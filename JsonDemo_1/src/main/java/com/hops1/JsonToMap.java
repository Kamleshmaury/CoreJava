package com.hops1;

import java.io.File;
import java.util.Map;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonToMap {
	public static void main(String[] args) {
		try {
			ObjectMapper mapper = new ObjectMapper();
			File file = new File("std.json");
			Map<String, Object> userData = mapper.readValue(file, new TypeReference<Map<String, Object>>() {
			});

			System.out.println("Name : " + userData.get("name"));
			System.out.println("Phone : " + userData.get("phone"));
			System.out.println("City : " + userData.get("city"));
			System.out.println("StdId : " + userData.get("studentId"));
		} catch (Exception ex) {
			System.out.println(ex);
		}

	}

}
