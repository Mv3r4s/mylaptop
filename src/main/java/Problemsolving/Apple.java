package Problemsolving;

import java.util.Locale;
import java.util.Scanner;

public class Apple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first String");
        String str1 = sc.nextLine();
        System.out.println("Enter the second String");
        String str2 = sc.nextLine();

        str1= str1.toLowerCase();
        str2 = str2.toLowerCase();

       str2 = str2.toUpperCase().charAt(0)+str2.substring(1);
       str1 = str1.toUpperCase().charAt(0)+str1.substring(1);
        System.out.println(str1+str2);





    }
}
