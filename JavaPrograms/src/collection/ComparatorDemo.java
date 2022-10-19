package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class User
{
	int id;
	String name;
	public User(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + "]";
	}
	
}

class UserSort implements Comparator<User>{
	public int compare(User o1, User o2) {
		return o1.name.compareTo(o2.name);
	}
	
}

public class ComparatorDemo {
	public static void main(String[] args) {
		List<User> list1 = new ArrayList<User>();
		list1.add(new User(3, "ravi"));
		list1.add(new User(1, "abc"));
		list1.add(new User(4, "xyz"));
		list1.add(new User(2, "test"));
		Collections.sort(list1, new UserSort());
		list1.forEach(System.out::println);
	}

}
