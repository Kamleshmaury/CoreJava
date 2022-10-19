package filecompression;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

public class GZip {
	public static void main(String[] args) {
		try
		{
			String file = "D:\\new\\io\\new.txt";
			String path = "D:\\new\\io\\new.gzip";
			byte[] buffer = new byte[1024];
			
			FileOutputStream fos = new FileOutputStream(path);
			GZIPOutputStream gzip = new GZIPOutputStream(fos);
			FileInputStream fis = new FileInputStream(file);
			
			int byteRead ;
			while((byteRead = fis.read(buffer)) > 0) {
				gzip.write(buffer, 0, byteRead);;
			}
			
			fis.close();
			gzip.finish();
			gzip.close();
			
			System.out.println("File created...");
		}
		catch(IOException ex) {
			System.out.println(ex);
		}
	}

}
