package oops;

class Animal {
	String name = "Labro";

	void eat(String food) {
		System.out.println("Eating  " + food);
	}
}

class Dog extends Animal {
	Dog() {
		System.out.println(super.name + " Dog eating..");
	}

	void eat(String food) {
		System.out.println("Dog  " + food);
	}

	void work() {
		super.eat("milk and rooti");
	}
}

public class SuperKeyWord {
	public static void main(String[] args) {
		Dog d1 = new Dog();
		d1.work();
	}
}
