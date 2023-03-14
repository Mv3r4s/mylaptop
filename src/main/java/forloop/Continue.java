package forloop;

import java.util.Scanner;

public class Continue {
    public static void main(String[] args) {

        /*
        create a program that print numbers from 1 to 10
        if number is equal to 5 do no print
         */

        /*print all number from 1 to 100 skipping even number */

        for (int i = 1; i <= 101; i++) {
            if (i % 2 == 0) {
                continue;

            }
            System.out.println(i);
        }
        /* skipping numbers that are divisible by 3 */
        for (int i = 1; i <= 101; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.println(i);
        }
        /*
        ask user to enter one negative and one positive and print all number in that range
        if number is even and negative, dont print it
        if number is odd and negative, dont print it
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter negative  number");
        int n1 = scanner.nextInt();
        System.out.println("Enter positive  number");
        int n2 = scanner.nextInt();

        for (int i = n1; i <= n2; i++) {

            if (i < 0 && i % 2 == 0) {
                continue;
            }

            if (i > 0 && i % 2 != 0) {
                continue;
            }
            System.out.println(i);
        }
        ///////////////////////
        int v = 1;
        while (v <= 10) {
            System.out.println("Good morning everyone");
            v++;
        }
        for (int g = 1; g <= 10; g++) {
            System.out.println("Good morning everyone");
        }
        int x = 100;
        while (x <= 1) {
            System.out.println();
            v--;

        }
    }
}