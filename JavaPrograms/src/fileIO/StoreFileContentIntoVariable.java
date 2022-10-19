package fileIO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class StoreFileContentIntoVariable {
	public static void main(String[] args) {
		String content = "";
		try
		{
			BufferedReader bin = new  BufferedReader(new FileReader("test2.txt"));
			String line = "";
			while((line=bin.readLine()) != null) {
				//store file content into String variable
				content = content + line +" ";
			}
			bin.close();
		}
		catch(IOException xe) {
			System.out.println(xe);
		}
		System.out.println(content);
	}

}
