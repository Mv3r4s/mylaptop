package forloop;

import java.util.Scanner;

public class Factorial {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter a positive integer: ");
            int num = sc.nextInt();
            int factorial = 1;

            while (num <= 0) {
                System.out.print("Please enter a positive integer: ");
                num = sc.nextInt();
            }

            for (int i = 1; i <= num; i++) {
                factorial *= i;
            }

            System.out.println("Factorial of " + num + " is: " + factorial);
        }
    }