package myFirstPackage;

import java.util.Scanner;

public class ScannerClassPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        sc.nextLine(); 

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter subject (as integer): ");
        int subject = sc.nextInt();

        System.out.print("Enter percentage: ");
        float percentage = sc.nextFloat();

        System.out.print("Enter income: ");
        double income = sc.nextDouble();

        System.out.print("Passed? (true/false): ");
        boolean result = sc.nextBoolean();

        System.out.println("\n--- Details Entered ---");
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("Subject (code): " + subject);
        System.out.println("Percentage: " + percentage);
        System.out.println("Income: " + income);
        System.out.println("Passed?: " + result);

        float score = marks * percentage / 100;
        System.out.println("\nScore (marks * percentage / 100): " + score);

        boolean isHighIncome = income > 50000;
        System.out.println("Is income > 50000? " + isHighIncome);

        sc.close(); 
    }
}
