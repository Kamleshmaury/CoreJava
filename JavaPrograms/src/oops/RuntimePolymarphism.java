package oops;
class Animal1
{
	void eat() {
		System.out.println("eating...");
	}
}
class Lion extends Animal1
{
	@Override
	void eat() {
		System.out.println("Lion eating meat");
	}
}

class Cat extends Animal1
{
	@Override
	void eat() {
		System.out.println("Cat eating rooti");
	}
}
public class RuntimePolymarphism {
	public static void main(String[] args) {
		Animal1 an = new Lion();
		an.eat();
		an = new Cat();
		an.eat();
	}

}
