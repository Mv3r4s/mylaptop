package whileDoLoop;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        /*
        write a program that prompts the user to enter a string. The program should display the number of digits
        in the string. The program should keep prompting the user to enter string until user enters a string with 3 digits.
         */
        Scanner sc = new Scanner(System.in);
        String str;
        int count;
        do {
            System.out.println("Enter a string:");
            str = sc.nextLine();
            count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (Character.isDigit(str.charAt(i))) {
                    count++;
                }
            }
        } while (count != 3);
        System.out.println("You entered a string with exactly 3 digits.");
    }
}