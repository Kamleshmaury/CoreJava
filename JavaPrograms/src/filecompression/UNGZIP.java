package filecompression;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;

public class UNGZIP {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		String file = "D:\\new\\io\\new.gzip";
		String path = "D:\\new\\io\\ungzip.txt";
		byte[] buffer = new byte[1024];
		
		GZIPInputStream gzip = new GZIPInputStream(new FileInputStream(file));
		FileOutputStream fous = new FileOutputStream(path);
		
		int totalSize;
        while((totalSize = gzip.read(buffer)) > 0 )
        {
        	fous.write(buffer, 0, totalSize);
        }
          
        fous.close();
        gzip.close();
          
        System.out.println("File Successfully decompressed");
	}

}
