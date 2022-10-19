package generic;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class GenericForLoop {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		map.put("s1", "sagar");
		map.put("s2", "karan");
		map.put("s3", "rahul");
		map.put("s4", "umesh");
		
		Set<String> key = map.keySet();
		//generic foor loop
		for(String s1 : key) {
			System.out.println("key : "+s1);
		}
		//generic foor loop
		for(String s2 : map.values()) {
			System.out.println("values : "+s2);
		}
	}

}
