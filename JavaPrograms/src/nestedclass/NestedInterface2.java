package nestedclass;

//interface inside class
class A
{
	interface Demo
	{
		void demo();
	}
}

public class NestedInterface2 implements A.Demo{
	
	public static void main(String[] args) {
		A.Demo ad = new NestedInterface2();
		ad.demo();
	}

	public void demo() {
		System.out.println("From demo interface");
	}
}
