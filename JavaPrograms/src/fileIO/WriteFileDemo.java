package fileIO;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFileDemo {
	public static void main(String[] args) {
		try
		{
//			FileWriter writer = new FileWriter("1.txt");  
//		    BufferedWriter buffer = new BufferedWriter(writer);  
//		    buffer.write("test to write .");  
//		    buffer.close();  
//		    System.out.println("Success"); 
			
			
			FileOutputStream fout = new FileOutputStream("1.txt");
		    fout.write(("hi all from 1").getBytes());//converting string into byte
		    System.out.println("Success..");
		    fout.close();
		    
		}
		catch(IOException ex) {
			System.out.println(ex);
		}
	}

}
