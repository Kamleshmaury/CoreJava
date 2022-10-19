package generic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterableStudent implements Iterable<Student> {

	List<Student> std;

	public IterableStudent() {
		std = new ArrayList<>();
	}
	
	public void addPerson(Student p) {
		std.add(p);
	   }
	
	@Override
	public Iterator<Student> iterator() {
		return std.iterator();
	}

	public static void main(String[] args) {
		Student std1 = new Student(1, "shalu");
		Student std2 = new Student(2, "ramesh");
		IterableStudent list = new IterableStudent();
		list.addPerson(std1);
		list.addPerson(std2);
		for(Student s1 : list) {
			System.out.println(s1);
		}
	}

}
