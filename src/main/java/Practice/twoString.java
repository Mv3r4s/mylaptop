package Practice;

import java.util.Scanner;

public class twoString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
// check if 2 string are igual
        System.out.println("1 string");
        String str1 = scanner.nextLine();

        System.out.println("2 string");
        String str2 = scanner.nextLine();

        System.out.println(str1.equals(str2));

    }
}
