package directory;

import java.nio.file.Path;
import java.nio.file.Paths;

public class CurrentWorkingDirect {
	public static void main(String[] args) {
		System.out.println("Current directory : "+System.getProperty("user.dir"));
		
		Path path = Paths.get("");
		System.out.println(path.toAbsolutePath().toString());
	}

}
