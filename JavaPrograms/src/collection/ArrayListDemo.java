package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(23);
		list.add(3);
		list.add(273);
		list.add(238);
		list.add(213);
		System.out.println(list);
//		for(Integer it : list) {
//			System.out.println(it);
//		}
		
		//list.remove(1);//remove at index 1 element and also suppy directly element which you want to remove
		Iterator<Integer> it = list.iterator();
		//list.add(35); //we can't add after iterate the element
		while(it.hasNext()) {
			Integer obj = it.next();
			//System.out.println(obj);
			//remove 273 element from list 
			if(obj == 273) {
				it.remove();
			}		
		}
		System.out.println(list);
		//read in reverse order
		ListIterator<Integer> lit = list.listIterator(list.size());
		while(lit.hasPrevious()) {
			System.out.println(lit.previous());
		}
		System.out.println("Read using for each.....");
		//read using for each
		list.forEach(a -> {
			System.out.print(a+" ");
		});
		System.out.println();
		//sort arrayList
		Collections.sort(list);
		System.out.println(list);
		
		
		
		ArrayList<Student> lst = new ArrayList<>();
		lst.add(new Student(3,"rakesh","diploma"));
		lst.add(new Student(2,"manoj","bca"));
		lst.add(new Student(1,"samu","ba"));
		lst.add(new Student(4,"tanuj","polytechnic"));
		
		lst.forEach(a -> System.out.println(a));
		
		//sort based on id
		System.out.println("sort based on id------");
		Collections.sort(lst,(o1,o2) -> o1.getId() - o2.getId());
		
		lst.forEach(a -> System.out.println(a));

		System.out.println("sort using stream");
		List<Student> lst1 = lst.stream().sorted(Comparator.comparing(Student::getName)).collect(Collectors.toList());
		
		lst1.stream().forEach(System.out::println);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
//arraylist allow duplicate but oredr is maintain