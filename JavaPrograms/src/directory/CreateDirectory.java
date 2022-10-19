package directory;

import java.io.File;

public class CreateDirectory {
	public static void main(String[] args) {
		
		String s1 = "D:\\new\\io\\directory\\hopsJava";
		File f1 = new File(s1);
		boolean b1 = f1.mkdir();
		if(b1) {
			System.out.println("directory created..");
		}else {
			System.out.println("not created..");
		}
	}

}
