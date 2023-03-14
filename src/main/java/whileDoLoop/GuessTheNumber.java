package whileDoLoop;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber { public static void main(String[] args) {
        /*
        write a program that generates a random number from 1 to 100
        and ask user to enter number, thr program should say
        "Too low, try again",   if guessed number is lower,
        "Too high, try again",  if guessed number is higher
        The program should keep asking for number, until user enters correct number
         */

    int randomNumber = new Random().nextInt(1, 100);

    Scanner Sr = new Scanner(System.in);
    int num2;

    do {
        System.out.println("enter a number");
        num2 = Sr.nextInt();
        if (num2 < randomNumber) {
            System.out.println("is too low");
        } else if (num2 > randomNumber) {
            System.out.println("is too high");
        } else {
            System.out.println(" you guess the right number");
            break;
        }
    } while (num2 <= 100);





        /*
        write a program that will ask user to enter a string
        and output the number of vowel that string has.
        keep asking user to enter string and outputting the number of vowels,
        until user enters a string with 10 vowels      | a i e o u
         */


}
}
