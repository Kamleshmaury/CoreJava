package oops;

public class Constrctor {
	
	//const without arg
	public Constrctor() {
		System.out.println("from default constructor..");
	}
	
	//arg const
	Constrctor(String name){
		this();
		System.out.println("Name is "+name);
	}

	public static void main(String[] args) {
		Constrctor con1 = new Constrctor("java");
		
	}
}
