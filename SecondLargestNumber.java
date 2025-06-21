package myFirstPackage;


public class SecondLargestNumber {
	
	
	public class SecondLargest{
		public static int findSecondLargest(int[] arr) {
		int first =  Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		
		for (int num :arr) {
			if(num>first) {
				second=first;
				first=num;
			}
			else if (num > second && num != first) {
				second=num;
			}
			
		}
		return second;
		}
	
		
	
	public static void main (String[] args) {
	int[] numbers = {1,2,3,4,50,50};
	
	int secondvalue = findSecondLargest(numbers);

	System.out.println("Second Largest: " + secondvalue);

}
}}
