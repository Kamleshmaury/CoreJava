package serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class WriteObject2 {
	public static void main(String[] args) {
			try
			{
				Student s1 = new Student(1001, "ramu");
				Student s2 = new Student(1002, "kam");
				Student s3 = new Student(1003, "deepu");
				FileOutputStream fout = new FileOutputStream("std1.txt");
				ObjectOutputStream out = new ObjectOutputStream(fout);
				out.writeObject(s1);
				out.writeObject(s2);
				out.writeObject(s3);
				out.close();
				System.out.println("success...");
			}
			catch(Exception ex) {
				System.out.println(ex);
			}
	}

}
