package oops;

class Name
{
	String name, lastName;
	public Name(String name, String lastName) {
		this.name = name;
		this.lastName = lastName;
	}

}
class Emplyee
{
	//here Employee has-a name
	public void diplay(int age, Name name){
		System.out.println("Age is : "+age);
		System.out.println("Name : "+name.name+" "+name.lastName);
	}
}
public class Aggregation {
	public static void main(String[] args) {
		Emplyee emp = new Emplyee();
		emp.diplay(25, new Name("Ramesh","Kumar"));
	}

}
