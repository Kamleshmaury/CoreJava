package fileIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class FileIntoByteArray {
	public static void main(String[] args) throws IOException {
		try {
			
			File f1 = new File("samplefile.txt");
			FileInputStream fis = new FileInputStream(f1);
			//creating byte array as same length of file
			byte[] arr = new byte[(int) f1.length()];
			fis.read(arr);
			System.out.println(Arrays.toString(arr));

			//pre defined Files.readAllBytes()
			Path path = Paths.get("samplefile.txt");
			byte[] arr1 = Files.readAllBytes(path);

			System.out.println(Arrays.toString(arr1));
			
			fis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
