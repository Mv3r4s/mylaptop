package Strings.Homework;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any sentence or string to reverse:");
        String str = sc.nextLine();
        String reversedStr = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr += str.charAt(i);
        }
        if (reversedStr.equalsIgnoreCase(str) ){
            System.out.println(reversedStr + " and " + str + " It's a palindrome");
        } else {
            System.out.println(reversedStr + " and " + str + " t's not palindrome");
        }
    }
}
