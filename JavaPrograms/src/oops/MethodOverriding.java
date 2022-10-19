package oops;

class Bank
{
	public double rateOfInterest(double rate) {
		return 0;
	}
}

class SBI extends Bank
{
	@Override
	public double rateOfInterest(double rate) {
		return rate;
	}
}
public class MethodOverriding {
	public static void main(String[] args) {
		SBI sbi = new SBI();
		System.out.println(sbi.rateOfInterest(8.5));
	}
}
