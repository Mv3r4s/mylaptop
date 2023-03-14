package scannerClass;

import java.util.Scanner;

public class newScann {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.println("whats your name ?");
            String name = sc.nextLine();

            System.out.println("how old are you?");
            int age = sc.nextInt();
            sc.nextLine();

            System.out.println("whats you favorite food ");
            String food = sc.nextLine();



    }
}
