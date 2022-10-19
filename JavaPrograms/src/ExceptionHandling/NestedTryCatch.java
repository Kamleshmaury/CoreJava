package ExceptionHandling;

public class NestedTryCatch {
	public static void main(String[] args) {
		try {
			
			System.out.println("outer try");
			
			try{    
			     System.out.println("going to divide by 0");    
			     int b =39/0;    
			   }  
			   catch(ArithmeticException e)  
			   {  
			     System.out.println(e);  
			   }    
			
			try {
				System.out.println("2 try start");
				String s1 = "abc";
				int i = Integer.parseInt(s1);
				System.out.println("2 try end");

				} 
				catch (NumberFormatException ex) {
					ex.printStackTrace();
				}
		} 
		catch (ArrayIndexOutOfBoundsException ex) {
			ex.printStackTrace();
		}
		System.out.println("done");
	}

}
