package filecompression;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipIntoFolder {

	private static final int BUFFER_SIZE = 4096;

	public static void main(String[] args) throws FileNotFoundException, IOException {

		ZipIntoFolder zig = new ZipIntoFolder();
		String[] s1 = {"D:\\new\\io\\Image_created_with_a_mobile_phone.png.webp",
						"D:\\new\\io\\ZiClJf-1920w.jpg","D:\\new\\io\\jd.txt"};
		String myimage = "D:\\new\\io\\image.zip";
		
		zig.listOfFiles(s1, myimage);
		System.out.println("created success..");
	}

	public void zip(List<File> listFiles, String destZipFile) throws FileNotFoundException, IOException {
		ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(destZipFile));
		for (File file : listFiles) {
			if (file.isDirectory()) {
				zipDirectory(file, file.getName(), zos);
			} else {
				zipFile(file, zos);
			}
		}
		zos.flush();
		zos.close();
	}
	
	//convert String array to list of files
	 public void listOfFiles(String[] files, String destZipFile) throws FileNotFoundException, IOException {
	        List<File> listFiles = new ArrayList<File>();
	        for (int i = 0; i < files.length; i++) {
	            listFiles.add(new File(files[i]));
	        }
	        zip(listFiles, destZipFile);
	    }

	private void zipDirectory(File folder, String parentFolder, ZipOutputStream zos)
			throws FileNotFoundException, IOException {
		for (File file : folder.listFiles()) {
			if (file.isDirectory()) {
				zipDirectory(file, parentFolder + "/" + file.getName(), zos);
				continue;
			}
			zos.putNextEntry(new ZipEntry(parentFolder + "/" + file.getName()));
			BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
			long bytesRead = 0;
			byte[] bytesIn = new byte[BUFFER_SIZE];
			int read = 0;
			while ((read = bis.read(bytesIn)) != -1) {
				zos.write(bytesIn, 0, read);
				bytesRead += read;
			}
			zos.closeEntry();
		}
	}

	private void zipFile(File file, ZipOutputStream zos) throws FileNotFoundException, IOException {
		zos.putNextEntry(new ZipEntry(file.getName()));
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
		long bytesRead = 0;
		byte[] bytesIn = new byte[BUFFER_SIZE];
		int read = 0;
		while ((read = bis.read(bytesIn)) != -1) {
			zos.write(bytesIn, 0, read);
			bytesRead += read;
		}
		zos.closeEntry();
	}
}
