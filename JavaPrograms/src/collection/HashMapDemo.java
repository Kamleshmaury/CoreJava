package collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap<Integer,String> map=new HashMap<Integer,String>();//Creating HashMap    
		   map.put(1,"Mango");  //Put elements in Map  
		   map.put(2,"Apple");    
		   map.put(3,"Banana");   
		   map.put(4,"Grapes"); 
		   map.put(7,"Banana");   
		   map.put(12,"Grapes"); 
		   
		   for(Map.Entry<Integer, String> obj : map.entrySet()) {
			   System.out.println(obj.getKey()+" : "+obj.getValue());
		   }
	}

}
