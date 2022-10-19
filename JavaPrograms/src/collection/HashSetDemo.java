package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet<String> set=new HashSet<>();  
        set.add("One");    
        set.add("Two");    
        set.add("Three");   
        set.add("Four");  
        set.add("Five");  
        set.add("Four");  //duplicate not allowed
        set.add("Five"); 
        Iterator<String> i=set.iterator();  
        while(i.hasNext())  
        {  
        System.out.println(i.next());  
        }
        
        set.remove("Four");//remove
        System.out.println(set);
        
        TreeSet<String> tset = new  TreeSet<>(set);//sort using treeset
        System.out.println(tset);
	}

}
//hashset don't allow duplicate but order is not maintain