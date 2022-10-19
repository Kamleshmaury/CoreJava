package java8;

import java.util.function.BiFunction;

class Arithmetic
{
	public static int add(int i, int j) {
		return i+j;
	}
}
interface SayHello
{
	void say();
	
}

class A
{
	public static void saySomething() {
		System.out.println("Hello this is from A");
	}
}
public class MethodRefrenceDemo {

	public static void main(String[] args) {
		SayHello sh = A::saySomething;
		sh.say();
		
		
		BiFunction<Integer, Integer, Integer> big = Arithmetic::add;
		int result = big.apply(10, 20);
		System.out.println(result);
	}
}
