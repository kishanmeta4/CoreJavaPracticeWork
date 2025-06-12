package myFirstPackage;

public class PrimeNumberPractice {
	
	public static void main(String[] args) {
	    int min = 3;
	    int max = 100;
	    for (int i = min; i <= max; i++) {
	        boolean isPrime = true;
	        for (int j = 2; j <= Math.sqrt(i); j++) {
	            if (i % j == 0) {
	                isPrime = false;
	                break;
	            }
	        }
	        if (isPrime) {
	            System.out.println("It is Prime Number: " + i);
	        }
	    }
	}
}