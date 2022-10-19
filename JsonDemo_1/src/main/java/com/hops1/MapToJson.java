package com.hops1;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;

public class MapToJson {
	public static void main(String[] args) {
		ObjectMapper mapper = new ObjectMapper();
		Map<String, Object> map = new HashMap<>();

		String name = "Honda City";
		String price = "1600000";
		String model = "base";
		String[] colors = new String[3];
		colors[0] = "Red";
		colors[1] = "Black";
		colors[2] = "White";
		
		map.put("Car", name);
		map.put("Price", price);
		map.put("Model", model);
		map.put("Colors", colors);
		try {
			//mapper.writeValue(new File("car.json"), map);//this is for write in json file
			String str = mapper.writeValueAsString(map);//json without preety printer
			System.out.println(str);
			System.out.println("Map data successfully inserted into car.json");
			String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(map);//json with preety printer
			System.out.println(json);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
