package Practice;

import java.util.Scanner;

public class maxint {
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
            System.out.println("1st number is the largest");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("2nd number is the largest");
        } else {
            System.out.println("3rd number is the largest");
        }
    }

}
