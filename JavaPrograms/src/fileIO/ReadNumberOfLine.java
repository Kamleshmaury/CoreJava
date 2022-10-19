package fileIO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadNumberOfLine {
	public static void main(String[] args) {
		try {
			BufferedReader bin = new BufferedReader(new FileReader("test2.txt"));
			int lines = 0;
			String s1 ="";
			while((s1=bin.readLine()) != null) {
				System.out.println(s1);
				lines++;
			}
			System.out.println("Number of lines : "+lines);
			bin.close();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

}
