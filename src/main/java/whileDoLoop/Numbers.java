package whileDoLoop;

import java.util.Scanner;

public class Numbers { public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int number;
    int sum = 0;
    int numOfNumbers = 0;

    while (true){
        System.out.println("Enter a positive number (or negative to quit):");
        number = scanner.nextInt();

        if (number == 0){
            continue;
        }
        else if (number < 0){
            break;
        }

        sum += number;
        numOfNumbers++;
    }

    System.out.println("The sum of all numbers: " + sum);
    System.out.println("The average of all numbers: " + sum / numOfNumbers);







        /*
        create a program that will keep asking a user to enter positive numbers,
        until negative number is entered.

        Enter a positive number (or negative to quit): 5
        Enter a positive number (or negative to quit): 5
        Enter a positive number (or negative to quit): 9
        Enter a positive number (or negative to quit): 11
        Enter a positive number (or negative to quit): -8

        The average of all numbers: 7     =====> average: (5 + 5 + 9 + 11) / 4
        The sum of all numbers: 30

        (optional) The largest number is: 11
        (optional) The smallest number is: 5

        USE: break, continue, while loop, scanner,  double, int
        int counter++
        sum++;
        if (number < 0){
        break;
        }
        if (number == 0){
        continue;
        }
         */

}

}
