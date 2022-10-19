package com.hops;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;

import com.google.gson.JsonArray;

public class JSONDemo1 {
	public static void main(String[] args) {
		
		Map map = new HashMap();
		map.put("name","rahul" );
		map.put("age", 24);
		map.put("course", "java");
		
		JSONObject obj = new JSONObject(map);
//		obj.put("name", "sonoo");
//		obj.put("age", 27);
//		obj.put("salary", 600000);
		System.out.println(obj);
		
		JsonArray arr = new JsonArray();
		arr.add("sonu");
		arr.add(26);
		arr.add(500000);
		System.out.println(arr);
	}

}
