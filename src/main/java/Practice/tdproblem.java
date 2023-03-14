package Practice;

import java.util.Scanner;

public class tdproblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter first number");
        int x = scanner.nextInt();

        System.out.println("enter second number");
        int y = scanner.nextInt();
        
        if (x > 0 && y > 0 ) {
            System.out.println(" both are positive");
        } else if (x == 0 || y == 0  ) {
            System.out.println(" Either x or y are positive");
        }
            else { System.out.println(" both are negative");
        }


    }
}
