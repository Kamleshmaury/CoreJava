package filecompression;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class FiletoZip {
	public static void main(String[] args) throws IOException {
		Path source = Paths.get("D:\\new\\io\\jd.txt");
		String zipName = "D:\\new\\io\\example.zip";
		zipSingleFile(source, zipName);
	}
	
	public static void zipSingleFile(Path source, String zipFileName)
	        throws IOException {

	        if (!Files.isRegularFile(source)) {
	            System.err.println("Please provide a file.");
	            return;
	        }

	        try (ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(zipFileName));
	            FileInputStream fis = new FileInputStream(source.toFile())) {

	            ZipEntry zipEntry = new ZipEntry(source.getFileName().toString());
	            zos.putNextEntry(zipEntry);

	            byte[] buffer = new byte[1024];
	            int len;
	            while ((len = fis.read(buffer)) > 0) {
	                zos.write(buffer, 0, len);
	            }
	            zos.closeEntry();
	        }

	}
}
