package forloop;

import java.util.Random;
import java.util.Scanner;

public class guess {
    public static void main(String[] args) {
        /*
        write a program to generate a random number from 1 to 100 then ask the user to enter number, the program
        should say "too low, try again"
        "too high, try again"
         */

        int randomNumber = new Random().nextInt(1, 100);

        Scanner user = new Scanner(System.in);
        int number;

        do {
            System.out.println("Enter a number");
            number = user.nextInt();

            if (number < randomNumber) {
                System.out.println("too low");
            } else if (number > randomNumber) {
                System.out.println("too high");
            } else {
                break;
            }
            if (number < 1 || number > 100) {
                System.out.println("Enter number in range 1-100");
            }
        } while (number != randomNumber);

        }
    }




