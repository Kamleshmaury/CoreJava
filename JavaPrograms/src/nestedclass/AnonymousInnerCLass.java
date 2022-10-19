package nestedclass;

class Demo
{
	int add(int i,int j) {
		return i+j;
	}
}

abstract class Person
{
	abstract void eat();
}

interface Student
{
	void display(String name, String course);
}
public class AnonymousInnerCLass {
	public static void main(String[] args) {
		Person p = new Person() {
			void eat() {
				System.out.println("eating fruit..");
			}
		};
		p.eat();
	
	
		Student st = new Student() {
			public void display(String name, String course) {
				System.out.println("Name: "+name+" ,course: "+course);
			}
		};
		st.display("ramu", "BCA");
		
		Demo d = new Demo() {
			int add(int i, int j) {
				return i-j;
			}
		};
		System.out.println(d.add(10,20));
	}
}
//Java anonymous inner class is an inner class without a name and for which only a single object is created.