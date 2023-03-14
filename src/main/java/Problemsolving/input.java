package Problemsolving;

import java.util.Scanner;

public class input {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter first String");
            String str = sc.nextLine();
            System.out.println("Enter second String");
            String str2 = sc.nextLine();
            str= str.toLowerCase();
            str2.toLowerCase();
            str2 = str2.substring(0, 1).toUpperCase() + str2.substring(1);
            System.out.println(str + str2);

            System.out.println(str.toUpperCase()+ " " );
        }
    }

