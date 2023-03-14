package Strings;

import java.util.Scanner;

public class Checkwheter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any sentence");
        String STR = sc.nextLine();
        STR = STR.toUpperCase();

        if (STR.contains("E")) {
            System.out.println(" " + STR.indexOf("E") + "The sentence contain E");
        } else {
            System.out.println("The sentence don't contain E");
        }
    }
}

