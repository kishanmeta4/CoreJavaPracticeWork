package myFirstPackage;

public class DivisibleNumbers {

	public static void main(String[] args) {
		for (int i=1; i<=100; i++) {
			if (i % 3==0 && i%5==0) {
				System.out.println("Numbers Divisible By 3 and 5 IS : "+ i);
			}
				
		}
	}
}
