package ExceptionHandling;

public class ExceptionPropagation {

	void m() {
		int i = 10 / 0;
	}

	void n() {
		m();
	}

	void test() {
		try {
			m();
		} catch (Exception ex) {
			System.out.println("exception handle");
		}
	}

	public static void main(String[] args) {
		ExceptionPropagation exp = new ExceptionPropagation();
		exp.test();
		System.out.println("execution of program done");
	}

}
//exception occured and not handled in m() so it propagate to previous method n() where is also not handled 
//so it propagate to previous test() where exception is handled even if there is also not handled then in main method can handled exception.
//if not handled then terminate the flow of program