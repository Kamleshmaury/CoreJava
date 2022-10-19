package com.hops;

import java.io.FileReader;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class ReadDataFromJson {
	public static void main(String[] args) {
		try {
			JSONParser jsonParser = new JSONParser();
			JSONObject jsonObject = (JSONObject) jsonParser.parse(new FileReader("std.json"));
			String name = (String) jsonObject.get("name");
			String phone = (String) jsonObject.get("phone");
			String city = (String) jsonObject.get("city");
			Long studentId = (Long) jsonObject.get("studentId");
			System.out.println("Name : " + name);
			System.out.println("Phone : " + phone);
			System.out.println("City : " + city);
			System.out.println("stdId : " + studentId);

		} catch (Exception ex) {
			System.out.println(ex);
		}
	}

}
