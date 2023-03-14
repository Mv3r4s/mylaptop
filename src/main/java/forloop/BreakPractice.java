package forloop;

import java.util.Scanner;

public class BreakPractice {
    public static void main(String[] args) {
        /*
        create a program that asks user to enter 2 numbers
        print all numbers up until the sum of 2 numbers.

        if there is number which is equal to 45, stop the loop
         */

        Scanner scanner =new Scanner (System.in);
        System.out.println("Enter first  number");
        int num1 = scanner.nextInt();
        System.out.println("Enter second  number");
        int num2 = scanner.nextInt();

        int sum = num1 + num2 ;

        for (int i = 0; i <= sum ; i ++) {
            if (i >= 46){
                break;

            }
            System.out.println(i);
        }
        System.out.println("After loop");

        /*

         */

    }
    }

