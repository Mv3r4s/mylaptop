package scannerClass;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {

        Scanner driver = new Scanner(System.in);
        System.out.println("how fast was going:");
        int speed = driver.nextInt();

        System.out.println("birthday? enter: true or false");
        boolean isBirthday = driver.nextBoolean();


        if (speed <= 60 ) { System.out.println("no ticket"); }
        else if (speed > 60 && speed <= 80 ) { System.out.println("no ticket"); }






    }
}
