package fileIO;

import java.io.File;
import java.io.IOException;

public class FIleIODemo {
	public static void main(String[] args) {
		try {
			File f1 = new File("test1.txt");
			boolean b1 = f1.createNewFile();
			if (b1) {
				System.out.println("File created...");
			} else {
				System.out.println("File already exits..");
			}

		} catch (IOException ex) {
			System.out.println(ex);
		}
	}

}
