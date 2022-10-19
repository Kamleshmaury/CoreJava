package reflection;

interface A {

}

class B {

}

public class ClassObject {
	public static void main(String[] args) {

		Class c1 = A.class;
		System.out.println(c1.isInterface());

		Class c2 = B.class;
		System.out.println(c2.isInterface());

	}

}
