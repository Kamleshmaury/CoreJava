package fileIO;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.text.SimpleDateFormat;

public class FileDateCreateModified {
	public static void main(String[] args) {
		File f1 = new File("D:\\new\\io\\new\\demo.txt");
		Path path = f1.toPath();
		try {
			BasicFileAttributes bfa = Files.readAttributes(path, BasicFileAttributes.class);

			//create simple date format 
			SimpleDateFormat sd = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
			//created date of file 
			System.out.println("file created on : "+sd.format(bfa.creationTime().toMillis()));
			
			//last modified time
			System.out.println("last modified time : "+sd.format(bfa.lastModifiedTime().toMillis()));
			
		
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
