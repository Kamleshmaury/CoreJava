package directory;

import java.io.File;

public class DeleteDirc {
	public static void main(String[] args) {
		File f1 = new File("D:\\new\\io\\directory");
		File[] files = f1.listFiles();
		for(File file : files) {
			if((file.getName()).equals("newFolder_0")) {
				System.out.println(file.delete());
			}
		}
	}

}
