package myFirstPackage;

public class PracticeForCount {
	
	public static void main(String[] args) {
		
		long number = 1234567234; 
        int count = 0;
        long temp = number;

        
        if (number == 0) {
            count = 1;
        } else {
            while (temp != 0) {
                temp = temp / 10;
                count++;
            }
        }

        System.out.println("Digits count: " + count); // Output: 7
    }
}

