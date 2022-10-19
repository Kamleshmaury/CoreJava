package annotation;
class A
{
	void run() {
		System.out.println("From A");
	}
}
class B extends A
{
	@Override
	void run() {
		System.out.println("From B");
	}
}
public class BuiltInAnnotation {
	public static void main(String[] args) {
		A a1 = new B();
		a1.run();
	}

}
