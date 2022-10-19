package string;

public class CompareDemo {
	public static void main(String[] args) {
		String s1 = "Java";
		String s2 = "Java";
		String s3 = new String("Java");
		String s4 = "Spring";
		String s5 = "java";
		
		//equals() used to compare the content not refrence type
		System.out.println(s1.equals(s2));//true
		System.out.println(s1.equals(s3));//true
		System.out.println(s1.equals(s4));//false
		
		System.out.println(s1.equals(s5));//false
		System.out.println(s1.equalsIgnoreCase(s5));//true b/s ignore the  case-sencetive
		
		// == operator use to compare refrence type of object where it pointing
		System.out.println(s1 == s2);//true b/s both pointing same object Java
		System.out.println(s1 == s3);//false 
		
		//compareTo() return int value 
		System.out.println(s1.compareTo(s2));//0  
		System.out.println(s1.compareTo(s4));//-9(because s1>s4)  
		System.out.println(s4.compareTo(s1));//9(because s4 < s1 ) 
	}

}
