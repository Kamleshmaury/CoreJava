package fileIO;

import java.io.File;
import java.io.FileWriter;

public class AppendContent {
	public static void main(String[] args) {
		File f1 = new File("test2.txt");
		try {
			if (f1.exists()) {
				String s1 = "append this word"; // \n for new line
				FileWriter fw = new FileWriter(f1, true);
				fw.write(s1);
				System.out.println("Append success..");
				fw.close();
			}
			
			

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
