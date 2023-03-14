package scannerClass;

import java.util.Scanner;

public class Season {
    public static void main(String[] args) {
        /* ask user to enter the name of the month:
        january, february march, december = winter
        */
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Whats the month:");
        String month = sc1.next();

        if (month.equalsIgnoreCase("january") ||
                month.equalsIgnoreCase("december") ||
                month.equalsIgnoreCase("february")) {
            System.out.println("winter");
        } else if (month.equalsIgnoreCase("march") ||
                month.equalsIgnoreCase("april") ||
                month.equalsIgnoreCase("may")) {
            System.out.println("sprint");
        } else if (month.equalsIgnoreCase("jun") ||
                month.equalsIgnoreCase("july") ||
                month.equalsIgnoreCase("august")) {
            System.out.println("summer");
        } else if (month.equalsIgnoreCase("september") ||
                month.equalsIgnoreCase("november") ||
                month.equalsIgnoreCase("December")) {
            System.out.println("autumn");
        } else {
            System.out.println("Invalid month");

        }
    }
}
