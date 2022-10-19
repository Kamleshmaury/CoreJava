package fileIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MoveFileToAnotherDirect {
	public static void main(String[] args) {
		try {
			String s1 = "D:\\new\\io\\demo.txt";//file to move
			String s2 = "D:\\new\\io\\new\\demo.txt";//file move path
			Path result = null;
			result = Files.move(Paths.get(s1),Paths.get(s2));
			
			if(result != null) {
				System.out.println("File moved successfully..");
			}
			else
			{
				System.out.println("File not moved..");
			}
		}
		catch(IOException ex) {
			System.out.println("Exception "+ex.getMessage());
		}
	}

}
