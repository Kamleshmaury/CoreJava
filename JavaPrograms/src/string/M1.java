package string;

public class M1 {
	public static void main(String[] args) {
		String s1 = "hello";
		System.out.println(s1);
		String s2 = new String("test");
		System.out.println(s2);
		
		//immutable
		String s = "Java ";
		s.concat("Programming");//concat() append the string at end
		System.out.println(s);//print only java b/s string is immutable
		s = s.concat("Programming");
		System.out.println(s);
		
	}

}
