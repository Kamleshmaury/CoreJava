package oops;

public class StaticVarBlock {
	
	static String name;//static variable
	
	//static block
	static {
		name = "Java";
		System.out.println("from static block-1");
	}
	
	static {
		System.out.println("from static block-2");
	}
	public static void main(String[] args) {
		System.out.println(name);
	}

}
