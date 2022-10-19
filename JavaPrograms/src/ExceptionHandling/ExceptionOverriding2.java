package ExceptionHandling;

class Test2
{
	void msg() {
		System.out.println("Parents class");
	}
}

public class ExceptionOverriding2  extends Test2{
	
	@Override
	void msg() throws ArithmeticException{
		System.out.println("Child class");
	}

	public static void main(String[] args) {
		Test2 t2 = new ExceptionOverriding2();
		t2.msg();
	}
}
//if parent class method does not declare an exception then is child class method you can't declare checked but can declare unchecked exception