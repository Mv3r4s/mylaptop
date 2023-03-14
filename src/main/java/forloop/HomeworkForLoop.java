package forloop;

import java.util.Scanner;

public class HomeworkForLoop {
    public static void main(String[] args) {
       // 1. Write a Java program to print the numbers which are divisible by 5, from 1 to 50 using a for loop.
        for (int i =1; i <=50; i++) {
            if (i % 5 == 0)
            System.out.println(i);
        }System.out.println();

        // 2. Write a Java program to print the even numbers from 2 to 20 using a for loop.
        for (int i=2; i <= 20; i+=2){
          System.out.println(i);
        }System.out.println();

        // 3. Write a Java program to print the first 10 natural numbers in reverse order using a for loop.
        for (int i=10 ; i>=1; i--){
            System.out.println(i);
        }System.out.println();

        // 4.  Write a Java program to print the multiplication table of 5 using a for loop.
        for (int i =1 ; i <=10; i++) {
            System.out.println("5*"+i + "=" + (5*i)  );
        }System.out.println();

        // 5. Write a Java program to print the first 20 odd numbers using a for loop.
        for (int i =1; i<=40 ; i+=2 ) {
            System.out.println(i);
        }System.out.println();

        // 6. Write a Java program to calculate the sum of the first 50 even numbers using a for loop.
        int sum  =0;
        for (int i = 2; i <= 100; i+=2) {
            sum += i;
            System.out.println(i);
        }System.out.println("sum of the first 50 even numbers" + sum);

        // 7. Write a Java program to calculate the sum of the digits of a given number using a for loop.
        // For example, if the number is 1234, the program should output 10 (1 + 2 + 3 + 4).
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any amount");
        int amount = sc.nextInt();
        int suma = 0;
         for (int i = amount; i>0 ; i ++){
             System.out.println();
         }





        // 8. Write a Java program to print the following pattern using nested for loops:
            /*            *****

                           ****

                            ***

                             **

                              *                                     */

        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(".");
            }
            for (int p = i; p <= rows; p++) {
                System.out.print(" ");
            }
            System.out.println();
        }


            //  9. Write a Java program to print the following pattern using nested for loops:

         /*         1

                    22

                    333

                    4444

*/
            int row = 4;
            for (int x = 1; x <= row; x++) {
                for (int j = 1; j <= x; j++) {
                    System.out.print(x);
                }
                System.out.println();
            }
            System.out.println();


        }
    }





