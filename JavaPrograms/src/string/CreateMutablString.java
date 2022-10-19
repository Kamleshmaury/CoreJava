package string;
class Person
{
	private String name;
	public Person(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
public class CreateMutablString {
	public static void main(String[] args) {
		Person p1 = new Person("Rahul");
		System.out.println(p1.getName());
		p1.setName("Rakesh");
		System.out.println(p1.getName());
	}

}
