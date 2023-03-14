package Switch;

import java.util.Scanner;

public class SwitchHomework {
    public static void main(String[] args) {

        //Write a program that takes symbol and prints corresponding meaning. Use switch statement.
        //! => exclamation mark
        //? => question mark
        //% => modulus
        //# => hash
        //* => star
        //@ => at
        //$ => dollar sign


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Special Char");
        char SpecialChar = sc.nextLine().charAt(0);

        switch (SpecialChar) {

            case '!':
                System.out.println("Exclamation mark");
                break;
            case '?':
                System.out.println("Question mark");
                break;
            case '%':
                System.out.println("Modulus");
                break;
            case '#':
                System.out.println("Hash");
                break;
            case '*':
                System.out.println("Star");
                break;
            case '@':
                System.out.println("At");
                break;
            case '$':
                System.out.println("Dollar sign");

            default:
                System.out.println("char invalid");
        }
    }
}
