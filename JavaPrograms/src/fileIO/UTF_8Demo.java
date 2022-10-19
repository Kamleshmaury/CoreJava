package fileIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class UTF_8Demo {
	public static void main(String[] args) {
		try {
			
			//write file
			Path path = Paths.get("D:\\new\\io\\new\\test.txt");
//			BufferedWriter writer = Files.newBufferedWriter(path, StandardCharsets.UTF_8);
//			writer.append("UTF-8 demo java");
//			writer.flush();
//			System.out.println("Data entered into the file");
			
			//read file
			BufferedReader bin = Files.newBufferedReader(path,StandardCharsets.UTF_8);
			StringBuffer sb = new StringBuffer();
			int ch=0;
			while((ch = bin.read()) != -1) {
				sb.append((char)ch+bin.readLine());
			}
			System.out.println(sb.toString());
			
		} catch (IOException ex) {
			System.out.println(ex);
		}
	}

}
