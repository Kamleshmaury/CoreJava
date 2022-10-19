package directory;

import java.io.File;
import java.util.Scanner;

public class CheckDirEMpty {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter directory path : ");
		String path = sc.next();
		
		File f1 = new File(path);
		File[] file = f1.listFiles();
		if(file.length == 0) {
			System.out.println("directory is empty");
			
		}else {
			System.out.println("directory is not empty");
			for(File f2 : file) {
				System.out.println(f2);
			}
		}
	}

}
