package collection;

import java.util.HashMap;import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class MapDemoSorting {
	public static void main(String[] args) {
		HashMap<Integer,String> map=new HashMap<Integer,String>();    
	    map.put(100,"Amit");    
	    map.put(102,"Ravi");    
	    map.put(101,"Vijay");    
	    map.put(103,"Rahul");
	    
	    map.forEach((a,b) -> System.out.println(a+":"+b));
	    
//	    System.out.println("Sorting based on key===");
//	    TreeMap<Integer, String> tm = new TreeMap<>(map);
//	    tm.forEach((a,b) -> System.out.println(a+":"+b));
	    
	    System.out.println("Sorting based on value=====");
	    TreeSet<Map.Entry<Integer, String>> tset = new TreeSet<>((o1,o2) -> o1.getValue().compareTo(o2.getValue()));
	    tset.addAll(map.entrySet());
	    tset.forEach(a -> System.out.println(a));
	}

}
