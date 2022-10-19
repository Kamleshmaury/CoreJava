package generic;

public class GenericClasses {
	
	public static void main(String[] args) {
		MyGen<Integer> my = new MyGen<>();
		my.add(12);
		System.out.println(my.get());
	}

}
