package nestedclass;
class OuterClass
{
	static int x = 10;
	int y=20;
	private static int z = 30;
	
	//static inner class
	static class StaticNestedClass
	{
		void display() {
			OuterClass ou = new OuterClass();
			
			System.out.println("Outer :"+x);
			//we required to create object of OuterClass
			System.out.println("Outer_y :"+ou.y);
			System.out.println("Outer_z :"+z);
		}
	}
}
public class NestedClassDemo {
	public static void main(String[] args) {
		OuterClass.StaticNestedClass ot = new OuterClass.StaticNestedClass();
		ot.display();
	}

}
//define a class inside another class is k/s nested class 