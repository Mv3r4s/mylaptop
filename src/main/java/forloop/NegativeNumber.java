package forloop;

import java.util.Scanner;

public class NegativeNumber {
    public static void main(String[] args) {
        /*
        write a program that will keep asking user to enter negative number until user enter negative number
         */
        Scanner scanner = new Scanner(System.in);
        int number ;

        do {
            System.out.println("enter even number");
            number = scanner.nextInt();
        } while (number % 2 != 0);


        }
    }

