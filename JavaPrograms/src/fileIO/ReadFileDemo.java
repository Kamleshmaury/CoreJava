package fileIO;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileDemo {
	public static void main(String[] args) {
		try
		{
			//read file
//			FileInputStream f1 = new FileInputStream("test2.txt");
//			BufferedInputStream bin = new BufferedInputStream(f1);
//			int s1;
//			while((s1 =bin.read()) != -1) {
//				System.out.print((char)s1);
//			}
			
			//read file
			FileReader fin = new FileReader("test2.txt");
			BufferedReader br = new BufferedReader(fin);
			String s1 ;
			while((s1=br.readLine()) != null) {
				System.out.println(s1);
			}
			br.close();
		}
		catch(IOException ex) {
			System.out.println(ex);
		}
	}

}
