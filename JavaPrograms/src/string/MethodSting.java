package string;

public class MethodSting {
	public static void main(String[] args) {
		String s1 = "Rahul";
		
		System.out.println(s1.length());
		
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		
		String s2 = "   Kamlesh  ";
		System.out.println(s2);
		System.out.println(s2.trim());//use to remove white spaces
		
		String s3 = "Sachin";
		System.out.println(s3.startsWith("Sa"));
		System.out.println(s3.endsWith("h"));
		
		System.out.println(s3.charAt(3));//return char at index 3
		
		String s5 = s1.intern();
		System.out.println(s5);
		
		int i=10;
		String s6 = String.valueOf(i);//convert integer to String
		System.out.println(i+s6);//1010
		
		String s7="Java is a programming language. Java is a platform. Java is an Island.";      
		String replaceString=s7.replace("Java","Kava");//replaces all occurrences of "Java" to "Kava"      
		System.out.println(replaceString);    
	}

}
