package fileIO;

import java.io.File;

public class DeletFile {
	public static void main(String[] args) {
		File f1 = new File("D:\\new\\io\\demo1.txt");
		boolean b1 = f1.delete();
		if(b1) {
			System.out.println(f1.getName()+" deleted...");
		}else {
			System.out.println("failed file not exist");
		}
		
		
	}

}
