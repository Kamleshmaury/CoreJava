package generic;

public class GenericMthod {
	
	//we can pass any type array
	public static <E> void printArray(E[] array) {
		for(E element : array) {
			System.out.print(element+",");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Integer[] intArray = { 10, 20, 30, 40, 50 };  
        Character[] charArray = { 'J', 'A', 'V', 'A', 'H','O','P','S' }; 
        
        System.out.println("Printing Integer array....");
        printArray(intArray);
        
        System.out.println("Printing Character array....");
        printArray(charArray);
	}

}
