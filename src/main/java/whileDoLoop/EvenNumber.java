package whileDoLoop;

import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        /*
        keep asking user to enter even number
        when user enters even number, stop
         */

        Scanner user = new Scanner(System.in);

        int num;

        do {
            System.out.println("Enter even number");
            num = user.nextInt();
        } while (num % 2 != 0);


    }
}


