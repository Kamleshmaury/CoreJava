package string;

public class StringBufferBuilder {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Hello ");
//		sb.append("Java");
//		System.out.println(sb);
		
//		sb.replace(1, 3, "Java");//replace Java fromIndex 1 to toIndex 3 
//		System.out.println(sb);//HJavalo
		
//		sb.delete(1, 3);
//		System.out.println(sb);
//		sb.insert(1, "New");//add New from index 1
//		System.out.println(sb);
		StringBuffer sb1 = new StringBuffer();
		System.out.println(sb1.capacity());//default capacity 16
		sb1.append("ramesh");
		System.out.println(sb1.capacity());
		sb1.append("java is my favourite language");
		System.out.println(sb1.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2  
		
		System.out.println(sb1.reverse());
		
	}

}
