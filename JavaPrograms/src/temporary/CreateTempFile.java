package temporary;

import java.io.File;
import java.io.IOException;

public class CreateTempFile {
	public static void main(String[] args) {
		try {
			
			//at specific location
//			String filepath = "D:\\new\\io\\temp";
//			String prefixName = "test1";
//			String suffix = ".temp";
//			File directoryPath = new File(filepath);
//			File file = File.createTempFile("test1", ".temp", directoryPath);
			
			//create at default location
			File file = File.createTempFile("hellotemp", ".temp");
			
			System.out.println("File created : "+file.getAbsolutePath());
		}
		catch(IOException ex) {
			System.out.println(ex);
		}
		
	}

}
