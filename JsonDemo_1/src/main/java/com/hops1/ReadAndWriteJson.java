package com.hops1;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ReadAndWriteJson {
	public static void main(String[] args) {
		try {
			ObjectMapper  mapper = new ObjectMapper();
			//write data in json file
//			Map<String, Object> map = new HashMap<>();
//			map.put("name", "kapil dev");
//			map.put("Age", 26);
//			map.put("city", "Bangalore");
//			mapper.writerWithDefaultPrettyPrinter().writeValue(new File("demo.json"), map);
//			System.out.println("Json File write successfully in demo.json");
			
			//read data from json file
			Map<String, Object> read = mapper.readValue(new File("demo.json"), new TypeReference<Map<String,Object>>() {
				}); 
			//conevrt json to string
			String str = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(read);
			System.out.println(str);
			
//			for(Map.Entry<String,Object> obj : read.entrySet()) {
//				System.out.println(obj.getKey()+":"+obj.getValue());
//			}
			System.out.println("Name : "+read.get("name"));
			System.out.println("Age : "+read.get("Age"));
			System.out.println("City : "+read.get("city"));
		} 
		catch (JsonGenerationException e ) {
			e.printStackTrace();
		}
		catch(JsonParseException ex) {
			ex.printStackTrace();
		}catch(JsonMappingException ex) {
			ex.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}

	}

}
