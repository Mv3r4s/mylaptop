package Switch;

import java.util.Scanner;

public class winter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the month in int");
        int month = sc.nextInt();

        switch (month) {
            case 12, 1, 2:
                System.out.println("winter");
                break;
            case 3, 4, 5:
                System.out.println("sprint");
                break;
            case 6, 7, 8:
                System.out.println("summer");
                break;
            case 9, 10, 11:
                System.out.println("outumm");
                break;
            default:
                System.out.println("Invalid month");
        }

        /////////////////////////
        if (month == 12 || month == 1 || month == 2) {
            System.out.println("winter");
        } else if (month == 3 || month == 4 || month == 5) {
            System.out.println("sprint");
        } else if (month == 6 || month == 7 || month == 8) {
            System.out.println("Summer");
        } else if (month == 9 || month == 10 || month == 11) {
            System.out.println("outumm");
        } else {
            System.out.println("Invalid month");
        }

    }

}
