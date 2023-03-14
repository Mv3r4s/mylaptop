package Practice;

import java.util.Scanner;

public class length {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("1st String");
        String Str1 = scanner.nextLine();

        System.out.println("2nd String");
        String Str2 = scanner.nextLine();

        if (Str1.length() > Str2.length()); {
            System.out.println(Str1 + ": " + Str1.length());
        }  if (Str2.length() > Str1.length()) {
            System.out.println(Str2 + ": " + Str2.length());
        } else {
            System.out.println(Str2 + ": " + Str2.length());
        }




    }

}
