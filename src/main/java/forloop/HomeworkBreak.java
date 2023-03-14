package forloop;

import java.util.Scanner;

public class HomeworkBreak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
/*
The program should then use a for loop to print all positive integers less than the input integer that are divisible
by 3, but not divisible by 5. If the input integer is not positive, the program should display an error message
and prompt the user to enter a positive integer. If there are no integers that meet the criteria, the program should
 display a message indicating that there are no such integers.
 */
        System.out.println("Enter a positive integer");
        int positive = sc.nextInt();

        for ( int i =1 ; i < positive; i++  ) {
            if (i % 3 == 0 && i % 5 != 0) {
                System.out.println(i);
            }
        }
            if (positive <= 0) {
                System.out.println("Please enter a positive integer");
            } else {
                System.out.print("Please enter integer that meet the criteria");

            }
        }
    }

