package collection;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet<Integer> tset = new TreeSet<>();
		tset.add(15);
		tset.add(56);
		tset.add(5);
		tset.add(6);
		tset.add(1);
		tset.add(23);
		System.out.println(tset);
		
		//TreeSet<Integer> tset1 = new TreeSet<>((o1,o2) -> o2-o1);//we can custom sort based on requirement 
		
		
		TreeSet<Student> ts = new TreeSet<>(new Comparator<Student>() {
			public int compare(Student s1, Student s2) {
				return s1.getName().compareTo(s2.getName());
			}
		});
		ts.add(new Student(3, "kamli", "mca"));
		ts.add(new Student(1, "raka", "ca"));
		ts.add(new Student(4, "santanu", "ba"));
		ts.add(new Student(2, "xyz", "ma"));
		ts.forEach(a -> System.out.println(a));
	}

}
