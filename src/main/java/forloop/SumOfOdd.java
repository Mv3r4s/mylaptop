package forloop;

import java.util.Scanner;

public class SumOfOdd {
    public class SumOfOddIntegers {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a positive integer: ");
            int num = sc.nextInt();
            int sum = 0;

            while (num <= 0) {
                System.out.print("Please enter a positive integer: ");
                num = sc.nextInt();
            }

            for (int i = 1; i <= num; i += 2) {
                sum += i;
            }
            System.out.println("Sum of odd integers up to " + num + " is: " + sum);
        }
    }
}
