package collection;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeSet;

public class HashTableDemo {
	public static void main(String[] args) {
		Hashtable<Integer, String> hash = new Hashtable<>();
		hash.put(2, "test");
		hash.put(1, "abc");
		hash.put(4, "hello");
		hash.put(3, "hi");
		for(Map.Entry<Integer, String> it : hash.entrySet()) {
			System.out.println(it.getKey()+"->"+it.getValue());
		}
		System.out.println("Sorted based on value==========");
		TreeSet<Map.Entry<Integer, String>> tset = new TreeSet<>((o1,o2) -> o1.getValue().compareTo(o2.getValue()));
		tset.addAll(hash.entrySet());
		tset.forEach(a -> System.out.println(a));
		
		System.out.println("read using enumeration ");
		Enumeration<Map.Entry<Integer, String>> en = Collections.enumeration(hash.entrySet());
		while(en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
	}

}
