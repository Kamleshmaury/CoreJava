package fileIO;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class ByteArrayToFile {
	public static void main(String[] args) {
		String s1 = "Hello from java byte array";
		byte[] arr = s1.getBytes();
		File f1 = new File("samplefile.txt");
		try
		{
			OutputStream out = new FileOutputStream(f1);
			out.write(arr);
			System.out.println("success..");
			out.close();
		}
		catch(IOException ex) {
			System.out.println(ex);
		}
	}

}
