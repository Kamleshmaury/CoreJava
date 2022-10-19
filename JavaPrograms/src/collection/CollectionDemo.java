package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class Person
{
	int id;
	String name;
	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}
	
	
}

public class CollectionDemo {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Amit");  
		list.add("Vijay");  
		list.add("Karan");  
		list.add("Jai");  
		list.add("Rahul");  
		
		String find = "Vijay";
		for(String lst : list) {
			if(lst.equals(find)) {
				System.out.println("find elemnt");
			}
		}
		
		//Collections.sort(list);
		
		Collections.sort(list,Collections.reverseOrder());
		System.out.println(list);
		
		ArrayList<Person> plist = new ArrayList<>();
		plist.add(new Person(2, "ramu"));
		plist.add(new Person(1, "test"));
		plist.add(new Person(4, "xyz"));
		plist.add(new Person(3, "abc"));
		
		Iterator<Person> it = plist.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("Sort based on name====");
		Collections.sort(plist,(o1,o2) -> o1.getName().compareTo(o2.getName()));
		plist.forEach(System.out::println);
	}

}
