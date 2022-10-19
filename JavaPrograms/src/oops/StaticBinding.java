package oops;
class Human
{
	public static void walk() {
		System.out.println("Human walking..");
	}
}
public class StaticBinding extends Human{
	
	public static void walk() {
		System.out.println("Child walking...");
	}
	
	public static void main(String[] args) {
		Human hm = new StaticBinding();
		hm.walk();
		Human hm1 = new Human();
		hm1.walk();
	}
}
//when type of object is determined at compile time is k/w static or Early binding