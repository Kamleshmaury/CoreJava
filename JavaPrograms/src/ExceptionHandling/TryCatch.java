package ExceptionHandling;

public class TryCatch {
	public static void main(String[] args) {
		try
		{
			System.out.println("try-start");
			int i = 10/0;
			System.out.println("try -end");
		}
		catch(ArithmeticException ex) {
			//System.out.println(ex);
			ex.printStackTrace();
		}
		System.out.println("done");
	}

}
