package fileIO;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ChangeFileLastModified {
	public static void main(String[] args) {
		try {
			File f1 = new File("test2.txt");
			SimpleDateFormat sd = new SimpleDateFormat("mm/dd/yyyy");
			System.out.println("Original Last Modified Date : " + sd.format((long) f1.lastModified()));
			
			String newLastModified = "10/10/2020";
			Date newDate = sd.parse(newLastModified);
			f1.setLastModified(newDate.getTime());
			// Print the updated "last modified" date
			System.out.println("Latest Last Modified Date : " + sd.format(f1.lastModified()));
		} catch (ParseException ex) {
			System.out.println(ex);
		}
	}

}
