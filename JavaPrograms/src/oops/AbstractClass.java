package oops;

abstract class Demo {
	abstract String lastName();

	String name(String name) {
		return name;
	}

}

class Impl extends Demo {

	String lastName() {
		return "Kumar";
	}

}

public class AbstractClass {
	public static void main(String[] args) {
		Impl d1 = new Impl();
		System.out.println("FirstName : "+d1.name("Kamlesh")+", lastName :"+d1.lastName());
	}

}
//we can't create object to abstract class
//Abstract class can have both abstract method and non-Abstract method