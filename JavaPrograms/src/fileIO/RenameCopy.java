package fileIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class RenameCopy {
	public static void main(String[] args) {
		
		//rename file
//		File f1 = new File("test1.txt");
//		File f2 = new File("newName.txt");
//		
//		if(f1.renameTo(f2)) {
//			System.out.println("rename of file done..");
//		}else {
//			System.out.println("file not found");
//		}
		
		//copy file from one to another
		try{
			FileInputStream fin = new FileInputStream(new File("test2.txt"));
			FileOutputStream fout = new FileOutputStream(new File("testout.txt"));
			
			int i;
			while((i=fin.read()) != -1) {
				fout.write(i);
			}
			System.out.println("file copied ");
		}
		catch(IOException ex) {
			System.out.println(ex);
		}
	}

}
