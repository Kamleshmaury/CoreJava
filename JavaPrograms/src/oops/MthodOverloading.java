package oops;

public class MthodOverloading {
	
	//method overloading
	void print(int a, int b) {
		int sum = a+b;
		System.out.println(sum);
	}
	
	//method overloading
	void print(int a, int b, int c) {
		int sum = a+b+c;
		System.out.println(sum);
	}
	public static void main(String[] args) {
		MthodOverloading m1 = new MthodOverloading();
		m1.print(12, 30);
		
		m1.print(5, 5, 5);
	}

}
