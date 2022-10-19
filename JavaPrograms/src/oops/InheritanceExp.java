package oops;

class A
{
	void add(int i, int j) {
		System.out.println("i: "+i+" j: "+j);
	}
}
class B extends A
{
	void subtract(int i, int c) {
		System.out.println("subtract : "+(i-c));
	}
}

public class InheritanceExp {
	public static void main(String[] args) {
		B b1 = new B();
		b1.add(10,20);
		b1.subtract(30, 10);
	}

}
//is-a relationship