package fileIO;

import java.io.File;

public class FileReadOnly {
	public static void main(String[] args) {
		File f1 = new File("newName.txt");
		boolean flag = f1.setReadOnly();
		System.out.println("file set read only: " +flag);
		System.out.println(f1.canWrite());
		
		//size of file
		long size = f1.length();
		System.out.println("size of file in bytes : "+size);
		
		//absolute file path
		System.out.println("file path : "+f1.getAbsolutePath());
		
		boolean b1 = f1.exists();
		if(b1) {
			System.out.println("file exists");
		}else {
			System.out.println("file not exists");
		}
		
		boolean b2 = f1.isHidden();
		if(b1) {
			System.out.println("file hidden");
		}else {
			System.out.println("file not hidden");
		}
	}

}
