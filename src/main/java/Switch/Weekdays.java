package Switch;

import java.util.Scanner;

public class Weekdays {
    public static void main(String[] args) {
        /*

         */
        int day = 5;

        switch (day) {
            case 1, 2, 3, 4, 5:
                System.out.println("Weekday");
                break;
            case 6, 7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Invalid day");
        }

        char letter = 'A';

        switch (letter) {
            case 'A', 'E', 'I', 'O', 'U':
                System.out.println("Vowels");
                break;
            default:
                System.out.println("Consonant");
        }
//////////////////////////////////

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the grade From A to F");
            char grade = sc.nextLine().charAt(0);

            switch (grade) {
                case 'A':
                    System.out.println("Excellent");
                    break;
                case 'B':
                    System.out.println("Good");
                    break;
                case 'C':
                    System.out.println("Fair");
                    break;
                case 'D':
                    System.out.println("Needs improvement");
                    break;
                case 'F':
                    System.out.println("Failed");
                    break;
                default:
                    System.out.println("Invalid grade");
            }
        }
    }


