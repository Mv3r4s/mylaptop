package Practice;

import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("month in interger");
        int month = scanner.nextInt();

        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12 );
        {
            System.out.println("31 days");


        }
    }
}

