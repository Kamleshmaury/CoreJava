package temporary;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class DeleteTempFile {
	public static void main(String[] args) {
		try
		{
			File directoryPath = new File("D:\\new\\io\\temp");
			File file = File.createTempFile("exampleTemp", ".temp", directoryPath);
			
			//path of file
			System.out.println("Temp file location : "+file.getAbsolutePath());
			//file deleted
			file.delete();
			System.out.println(file.exists());
			
		}
		catch(IOException ex) {
			System.out.println(ex);
		}
	}

}
