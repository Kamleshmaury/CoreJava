package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<Integer,String>();  
		  map.put(100,"Amit");  
		  map.put(101,"Vijay");  
		  map.put(102,"Rahul");  
		  
		  for(Map.Entry<Integer, String> it : map.entrySet()) {
			  System.out.println(it.getKey()+" -> "+it.getValue());
		  }
		  
		  Iterator<Map.Entry<Integer, String>> it = map.entrySet().iterator();
		  while(it.hasNext()) {
			  System.out.println(it.next());
		  }
	}
}
