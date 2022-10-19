package collection;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeMapDemo {
	public static void main(String[] args) {
		TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
	    map.put(100,"Amit");    
	    map.put(102,"Ravi");    
	    map.put(101,"Vijay");    
	    map.put(103,"Rahul");    
	        
	    for(Map.Entry<Integer, String> m:map.entrySet()){    
	       System.out.println(m.getKey()+" "+m.getValue());    
	    } 
	    
	   //sort based on value
	    TreeSet<Map.Entry<Integer, String>> tset = new  TreeSet<>((o1,o2)->o1.getValue().compareTo(o2.getValue()));
	    tset.addAll(map.entrySet());
	    System.out.println(tset);

	}

}
