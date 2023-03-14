package Problemsolving;

import java.util.Scanner;

public class EasyEmpty {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.nextLine();
        String wd = "";

        if (str == wd) {
            System.out.println("The string is empty.");
        } else {
            System.out.println("The string is not empty.");
        }
    }
}