package oops;

public class ThisKeyword {
	
	String name;
	int age;
	public ThisKeyword(String name,int age) {
		this.name = name;
		this.age = age;
	}

	public static void main(String[] args) {
		ThisKeyword th = new ThisKeyword("Kamlesh", 24);
		System.out.println("Name : "+th.name+" , age : "+th.age);
	}
}
