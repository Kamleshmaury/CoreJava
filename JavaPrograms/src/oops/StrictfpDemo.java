package oops;

public class StrictfpDemo {
	
	public strictfp double add() {
		double d1 = 2.45;
		double d2 = 3.557;
		return d1+d2;
	}
	public static void main(String[] args) {
		StrictfpDemo st = new StrictfpDemo();
		System.out.println(st.add());
	}

}
//It is used in java for restricting floating-point calculations and ensuring the same result on 
//every platform while performing operations in the floating-point variable. 
