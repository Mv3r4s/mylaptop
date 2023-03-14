package Strings.Homework;

import java.util.Scanner;

public class zipcode {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a valid zipcode");
            int zip = sc.nextInt();

            if ((zip + "").length() == 5) {
                if ((zip<= 0) || !(zip + "").contains("9")) {
                    System.out.println("invalid zip");
                } else {
                    System.out.println("valid zip");
                }
            } else {
                System.out.println("zip");
            }
        }
    }



