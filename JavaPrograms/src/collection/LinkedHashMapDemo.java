package collection;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
	public static void main(String[] args) {
		LinkedHashMap<Integer, String> hm = new LinkedHashMap<Integer, String>();

		hm.put(100, "Amit");
		hm.put(101, "Vijay");
		hm.put(102, "Rahul");
		
		for (Map.Entry<Integer,String> m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		
		hm.put(123, "Test");
		
		System.out.println(hm);
	}

}
