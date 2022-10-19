package fileIO;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InputStreamToString {
	public static void main(String[] args) {
		try {

			InputStream inputStream = new FileInputStream("test2.txt");

			InputStreamReader isReader = new InputStreamReader(inputStream);

			BufferedReader reader = new BufferedReader(isReader);
			String sb = "";
			String str;
			while ((str = reader.readLine()) != null) {
				sb = sb+str;
			}
			System.out.println(sb);
			reader.close();
		} catch (IOException ex) {
			System.out.println(ex);
		}
	}

}
