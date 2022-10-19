package fileIO;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

public class StringToInputStream {
	public static void main(String[] args) throws IOException {
		String string = "Geeks for Geeks";
        System.out.print("String : " + string);

        InputStream stream = new ByteArrayInputStream(string.getBytes(Charset.forName("UTF-8")));
 
       
        BufferedReader br = new BufferedReader(new InputStreamReader(stream));
 
     
        String str = br.readLine();
 
        System.out.print("\nInput stream : ");

        while (str != null) {
            
            System.out.println(str);
            str = br.readLine();
        }
	}

}
