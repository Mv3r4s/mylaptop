package scannerClass;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number:");
        int num1 = sc.nextInt();
        System.out.println("Enter second number:");
        int num2 = sc.nextInt();
        System.out.println("Enter third number:");
        int num3 = sc.nextInt();

        System.out .println("Thanks");
        System.out.println();

         /*
        write a program that prompts the user to enter an integer between 1 and 10.

        use the scanner class to read the user's input, and validate that the input is within  the specified range

        if the input is valid, print out, "Valid input", otherwise print out "Invalid input".

         */

        Scanner sc1 = new Scanner(System.in);
        System.out.println("integer between 1 and 10:");
        int num = sc1.nextInt();

        if(num >= 1 && num <= 10) {
            System.out.println("Valid input");
        } else {
            System.out.println("Invalid input");
        }
    }
}





