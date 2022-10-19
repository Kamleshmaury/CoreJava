package com.hops1;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;

public class JacksonStreamJsonGenrtor {
	public static void main(String[] args) {

		try {
			JsonFactory factory = new JsonFactory();
			JsonGenerator jsonGenerator = factory.createGenerator(new File("sports.json"), JsonEncoding.UTF8);
			//start writing json {
			jsonGenerator.writeStartObject();
			//writing string key and string value
			jsonGenerator.writeStringField("Name", "Ramu");
			//writing string key and integer value
			jsonGenerator.writeNumberField("Age", 25);
			
			//write field
			jsonGenerator.writeFieldName("FavouriteSports");
			//start json array [
			jsonGenerator.writeStartArray();
			//writing array value
			jsonGenerator.writeString("Footbal");
			jsonGenerator.writeString("Cricket");
			jsonGenerator.writeString("Hockey");
			jsonGenerator.writeString("Chess");
			//end array ]
			jsonGenerator.writeEndArray();
			//end to write json }
			jsonGenerator.writeEndObject();
			System.out.println("File created with name sports.json");
			jsonGenerator.close();
			
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}