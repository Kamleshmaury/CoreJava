package fileIO;

import java.io.File;
import java.io.FilenameFilter;

public class FindFileInFolderWithCertainExt {
	public static void main(String[] args) {

		String dname = "D:\\new\\io";
		String ext = ".txt";
		
		File fileDir = new File(dname);
		//
		ExtensionFilter extFilter = new ExtensionFilter(ext);

		File[] listOfFiles = fileDir.listFiles(extFilter);

		if (listOfFiles.length == 0) {
			System.out.println("No files end with : " + ext);
			return;
		}

		for (File file : listOfFiles) {
			System.out.println(file.getName());
		}
	}
}

//implement accept() of FilenameFilter interface 
class ExtensionFilter implements FilenameFilter {

	private String fileExtension;

	public ExtensionFilter(String fileExtension) {
		this.fileExtension = fileExtension;
	}
	
	@Override
	public boolean accept(File dir, String name) {
		return (name.endsWith(fileExtension));
	}

}
