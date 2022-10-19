package directory;

import java.io.File;

public class MultipleDirecctory {
	public static void main(String[] args) {
		//multiplr folder one folder inside another folder
		String s1 = "D:\\new\\io\\directory\\hops1Java\\hopsJava2\\hopsJava3";
		File f1 = new File(s1);
		boolean b1 = f1.mkdirs();
		if(b1) {
			System.out.println("multiple directory created..");
		}else {
			System.out.println("not created already exist..");
		}
		
		//multiple folder in same place at a time
		String myDirectoryPath = "D:\\new\\io\\directory\\newFolder";

        for (int i = 0; i < 5; i++) {
            File myDirectory = new File(myDirectoryPath + "_" + i);

            if (!myDirectory.exists()) {
                if (myDirectory.mkdir()) {
                    System.out.println(myDirectory.getName() + " created successfully.");
                } else {
                    System.out.println("Couldn't create " + myDirectory.getName());
                }
            } else {
                System.out.println(myDirectory.getName() + " already exists.");
            }
        }
	}

}
