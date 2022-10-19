package ExceptionHandling;

public class FinallyBlock {
	public static void main(String[] args) {
		try {
			System.out.println("from try");
			int i = 10 / 0;
			System.out.println("try end");
		} 
//		catch (ArithmeticException ex) {
//			System.out.println(ex);
//		} 
//		catch(NullPointerException ex) {
//			System.out.println(ex);
//		}
		finally {
			System.out.println("finally block is always execute");
		}

		System.out.println("done");
	}
}
//finally block is always execute weather exception handled or not
//we can kepp try without any catch with finally