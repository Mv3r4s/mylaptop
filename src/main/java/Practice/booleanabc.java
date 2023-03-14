package Practice;

import java.util.Scanner;

public class booleanabc {
    public static void main(String[] args) {

       Scanner sc1 = new Scanner(System.in);
       System.out.println("introduce  the first ");
       boolean a = sc1.nextBoolean();
        System.out.println("introduce the second ");
        boolean b = sc1.nextBoolean();
        System.out.println("introduce the 3rd");
        boolean c = sc1.nextBoolean();

        if(a && b && c){
            System.out.println("all true");
        } else if ((a&&b)||(b&&c)||(c&&a)){
            System.out.println("at least two are true");
        } else {
            System.out.println("at least 2 are not true");
        }
    }
}

