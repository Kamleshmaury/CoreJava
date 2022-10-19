package reflection;

class Simple {
}

class Demo {
	void printName(Object obj) {
		Class<? extends Object> c = obj.getClass();
		System.out.println(c.getName());
	}

	public static void main(String args[]) throws ClassNotFoundException {
		Simple s = new Simple();
		Demo t = new Demo();
		t.printName(s);
	}
}