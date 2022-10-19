package directory;

import java.io.File;
import java.util.Scanner;

public class ListDirectory {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter directory path : ");
		String path = sc.next();
		
		File f1 = new File(path);
		File[] files = f1.listFiles();
		for(File file : files) {
			if(file.isDirectory()) {
				System.out.println("Directory: "
                        + file.getName());
			}
			else
			{
				System.out.println("Files : "+file.getName());
			}
		}
	}

}
