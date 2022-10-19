package filecompression;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.zip.GZIPOutputStream;

public class SerializedIntoFile {
	public static void main(String[] args) {
		Student st = new Student(101, "demo");
		try
		{
			FileOutputStream fout = new FileOutputStream("D:\\new\\io\\std.gzip");
			GZIPOutputStream gzip = new GZIPOutputStream(fout);
			ObjectOutputStream out = new ObjectOutputStream(gzip);
			out.writeObject(st);
			out.close();
			System.out.println("done");
		}
		catch(Exception ex) {
			System.out.println(ex);
		}
	}

}
