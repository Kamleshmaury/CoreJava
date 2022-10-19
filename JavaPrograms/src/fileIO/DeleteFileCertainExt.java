package fileIO;

import java.io.File;

public class DeleteFileCertainExt {
	public static void main(String[] args) {
		File f1 = new File("D:\\new\\io\\demo.txt");
		
		if(f1.exists()) {
			String fname = f1.getName();
			String ext = "";
			int i = fname.lastIndexOf('.');
			if(i > 0) {
				ext = fname.substring(i);
				//deleting file with extension .zip only
				if(ext.equals(".zip")) {
					f1.delete();
					System.out.println("file deleted with ex : "+ext);
				}else {
					System.out.println("file extension not match..");
				}
			}
		}
		else
		{
			System.out.println("file does not exist");
		}
		
	}

}
