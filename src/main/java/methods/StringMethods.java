package methods;

import java.util.Scanner;

public class StringMethods {
    static boolean compareStrings(String str1, String str2) {
        if (str1.equalsIgnoreCase(str2)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        boolean isSame = compareStrings("hello", "hello");
        System.out.println(isSame);
        compareStrings("bye", "bye");

    }

    static String concatenetedSTR(String st1, String st2) {
        return st1.toLowerCase() + st2.toLowerCase();
    }

    static int coedSTRandlen(String s1, String s2) {
        String bt = s1.toLowerCase() + s2.toLowerCase();
        return bt.length();

    }
    /*
    take int and return  true if inte is even else false

     */

   /* static boolean ifisboolean(int e) {
        if (e % 2 == 0) {
            return true;
        }
    } */

    /*
true if the number div by 1
     */

    public static boolean isdiv(int b) {
        return b % 10 == 0;
    }

    /*
    void  method with take one int and print out multiplication table of this int

     */
    public void tableOf5() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(num1 + " * " + i + " = " + (num1 * i));
        }
    }

    /*
    create a method that take two int an print the largues one
     */
    public static void printLarger(int a, int b) {
        if (a > b) {
            System.out.println(a + " is larger.");
        } else if (b > a) {
            System.out.println(b + " is larger.");
        } else {
            System.out.println("Both numbers are equal.");
        }
    }

    /*
    from 4 int print the avarage
     */
    /*public static void avarage (int a, int b,int c, int d) {
        return (a + b + c + d) / 4;
    }
    /*
    create a method wich take on int and return the sum of all numbers starting from 1 up to the end
     */
    public static int sumUpTo(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}


