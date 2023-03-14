package Practice;

import java.util.Scanner;

public class containerjava {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        if (num2 % num1 == 0) {
            System.out.println(num2 + " is divisible by " + num1);
        } else {
            System.out.println(num2 + " is not divisible by " + num1);
        }

        /////////////
        Scanner SC = new Scanner(System.in);

        System.out.print("Enter the first boolean: ");
        boolean b1 = SC.nextBoolean();

        System.out.print("Enter the second boolean: ");
        boolean b2 = SC.nextBoolean();


        if (b1 == false && b2 == true) {
            System.out.println("A is true and B is false");
        } else if (b1 == false && b2 == true) {
            System.out.println("Ais false and B is true");
        } else if (b1 == true && b2 == true) {
            System.out.println("Both A and B true");
        } else if (b1 == false && b2 == false) {
            System.out.println("Both false");
        } else if (b1 == true || b2 == true) {
            System.out.println("Either A or B is true  ");
        } else {
            System.out.println("invalid data");

        }


    }
}




