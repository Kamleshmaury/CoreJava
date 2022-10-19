package ExceptionHandling;

public class MultipleCatch {
	public static void main(String[] args) {
		try
		{
			System.out.println("try-start");
			String s1 = null;
			System.out.println(s1.length());
			System.out.println("try -end");
		}
		catch(NullPointerException ex) {
			ex.printStackTrace();
		}
		catch(RuntimeException ex) {
			ex.printStackTrace();
		}
		catch(Exception ex) {
			//System.out.println(ex);
			ex.printStackTrace();
		}
		System.out.println("rest code execute..");
	}

}
