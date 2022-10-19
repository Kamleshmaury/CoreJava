package temporary;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteIntoTempFile {
	public static void main(String[] args) {
		try
		{
			File directoryPath = new File("D:\\new\\io\\temp");
			File file = File.createTempFile("temptest1", ".temp", directoryPath);
			BufferedWriter bw = new BufferedWriter(new FileWriter(file));
			bw.write("Hello this is from temp file ...");
			
			System.out.println("data stored in temp file");
			System.out.println("Temp file location : "+file.getAbsolutePath());
			bw.close();
		}
		catch(IOException ex) {
			System.out.println(ex);
		}
	}

}
