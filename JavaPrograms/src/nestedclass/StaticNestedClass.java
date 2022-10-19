package nestedclass;

public class StaticNestedClass {
	static int data = 30;
	
	static class Ineer{
		static void msg() {
			System.out.println("data :"+data);
		}
	}
	public static void main(String[] args) {
		StaticNestedClass.Ineer.msg();
	}

}
