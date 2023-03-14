package forloop;

import java.util.Scanner;

public class whilePrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();

        boolean isPrime = true ;
        int i = 2 ;
        while (i < number) {

            if (number % i == 0) {
                isPrime = false;
                break;
            }
            i++;
        }

            if (isPrime){
                System.out.println("It is prime number ");
            } else {
                System.out.println("It isn't prime number ");
            }
        }
    }

