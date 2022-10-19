package ExceptionHandling;

import java.io.IOException;

class Test1
{
	void check() throws IOException  
	{
		System.out.println("Parents class");
	}
}

public class EceptionOverriding extends Test1{
	
	@Override
	void check() throws IOException {
		System.out.println("Child class");
	}
	public static void main(String[] args) {
		Test1 t1 = new EceptionOverriding();
		try{
			t1.check();
		}
		catch(IOException ex) {
			System.out.println(ex);
		}
	}
}
