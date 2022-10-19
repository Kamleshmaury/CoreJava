package oops;
class Car
{
	String color;
	Car(){
		System.out.println("From Car");
	}
	//IIB initialize the instance variable
	{
		System.out.println("execute IIB-Block");
		this.color = "Red";
	}
}
public class InstanceBlock {
	public static void main(String[] args) {
		Car c1 = new Car();
		System.out.println("Color of car is "+c1.color);
	}
}
