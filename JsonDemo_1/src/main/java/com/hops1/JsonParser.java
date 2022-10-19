package com.hops1;

import java.io.File;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonToken;


public class JsonParser {
	public static void main(String[] args) {
		try
		{
			JsonFactory factory = new JsonFactory();
			com.fasterxml.jackson.core.JsonParser parser = factory.createParser(new File("sports.json"));
			//using array we can read muliple array object END_ARRAY if use END_OBJECT then read only one object
			while(parser.nextToken() != JsonToken.END_ARRAY) {
				String fieldName = parser.getCurrentName();
				if("Name".equals(fieldName)) {
					parser.nextToken();
					System.out.println(parser.getText());
				}
				if("Age".equals(fieldName)) {
					parser.nextToken();
					System.out.println(parser.getIntValue());
				}
				if("FavouriteSports".equals(fieldName)) {
					parser.nextToken();
					while(parser.nextToken() != JsonToken.END_ARRAY) {
						System.out.println(parser.getText());
					}
				}
				
			}
		}
		catch(Exception ex) {
			System.out.println(ex);
		}
	}

}
