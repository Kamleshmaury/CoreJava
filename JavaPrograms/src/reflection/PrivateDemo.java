package reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

class Student
{
	private String name;
	private int age;
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//age private
	private int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}

public class PrivateDemo {
	public static void main(String[] args){
		
		try{
			Student s1 = new Student("rahul", 25);
			
			//
			Field f1 = Student.class.getDeclaredField("name");
			//set accessible true
			f1.setAccessible(true);
			//store the value of private field in name variable
			String name = (String) f1.get(s1);
			System.out.println("name of student : "+name);
			
			//private method age access
			Method m1 = Student.class.getDeclaredMethod("getAge");
			m1.setAccessible(true);
			int age = (int) m1.invoke(s1);
			System.out.println("Age of Student : "+age);
		}
		catch(Exception ex) {
			System.out.println(ex);
		}
		
	}

}
