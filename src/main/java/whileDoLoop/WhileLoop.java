package whileDoLoop;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {

//        int i = 1;
//
//        while (i <= 100){
//
//            if (i % 2 == 0){
//                System.out.println(i);
//            }
//            i++;
//        }

        /*
        using while loop, print even numbers from 1 to 100
         */

        int a = 1;

        while (a <= 10){
            System.out.println("Good morning everyone");
            a++;
        }

        for (int k = 1; k <= 10; k++){
            System.out.println("Good morning");
        }

        /*
        print only odd numbers from 100 to 1
        using while loop
        and for loop
         */


        /*

        write a program that will print true if number is prime, else false
        prime number is the number that can only be divided by 1 and by itself
        USE WHILE LOOP
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt(); //40

        boolean isPrime = true;

        int i = 2;

        while (i < number){
            if (number % i == 0){
                isPrime = false;
                break;
            }
            i++;
        }

        if (isPrime){
            System.out.println("Number is prime");
        }else{
            System.out.println("Not prime");
        }
    }
}
