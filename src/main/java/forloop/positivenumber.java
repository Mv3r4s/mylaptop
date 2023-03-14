package forloop;

import java.util.Scanner;

public class positivenumber {
    public static void main(String[] args) {
         /*
        write a program that will keep asking user to enter positive number until positive number is entered
         */
        Scanner scanner = new Scanner(System.in);
        int number ;

        do {
            System.out.println("Enter positive number");
            number = scanner.nextInt();
        } while (number > 0);



    }
}

