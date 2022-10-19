package console;

import java.io.Console;

public class Demo {
	public static void main(String[] args) {
		Console con = System.console();
		String s1 = con.readLine("enter name");
		System.out.println(s1);
		System.out.println("Enter the password: "); 
        char[] ch=con.readPassword(); 
  
        //converting char array into string 
        String pass = String.valueOf(ch); 
        System.out.println("Password is: " + pass);
	}

}
