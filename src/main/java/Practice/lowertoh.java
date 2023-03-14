package Practice;

import java.util.Scanner;

public class lowertoh {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
// check the largest
        System.out.println("1st number");
        int num1 = scanner.nextInt();

        System.out.println("2nd number");
        int num2 = scanner.nextInt();

        System.out.println("3rd number");
        int num3 = scanner.nextInt();


        if (num1 > num2 && num1 > num3) {
            if (num2 > num3) {
                System.out.println("descending" + num1 + ", " + num2 + ", " + num3);
                System.out.println(num3 + ", " + num2 + ", " + num1);
            } else if (num3 > num2) {
                System.out.println("descending" + num1 + ", " + num3 + ", " + num2);
                System.out.println(num2 + ", " + num3 + ", " + num1);
            }

        }

        if (num2 > num3 && num2 > num1) {
            if (num3 > num1) {
                System.out.println("descending" + num2 +", " + num3 +", " + num1);
                System.out.println(num1 +", " + num3 +", " + num2);
            } else if (num1 > num3) {
                System.out.println("descending" + num2 +", " + num1 +", " + num3);
                System.out.println(num3 +", " + num1 +", " + num2);
            }

        }

        if (num3 > num2 && num3 > num1) {
            if (num2 > num1) {
                System.out.println("descending" + num3 +", " + num2 + ", " +num1);
                System.out.println(num1 +", " + num2 + ", " +num3);
            } else if (num1 > num2) {
                System.out.println("descending" + num3 +", " + num1 +", " + num2);
                System.out.println(num2 +", " + num1 +", " + num3);
            }

        }

    }
}
