package oops;
class Human1
{
	public void walk() {
		System.out.println("Human Walking....");
	}
}
class Boy extends Human1
{
	public void walk() {
		System.out.println("Boy Walking....");
	}
}
public class DynamicBinding {
	public static void main(String[] args) {
		Human1 hm = new Boy();//ref of Human1 for Boy Object
		hm.walk();
		Human1 hm1 = new Human1();//ref of Human1 for Humna1 Object
		hm1.walk();
	}

}
//when compiler not able to resolve at compile time then such binding is k/w as dynamic binding.
//