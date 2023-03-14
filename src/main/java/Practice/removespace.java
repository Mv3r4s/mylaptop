package Practice;

import java.util.Scanner;

public class removespace {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("introduce any string");
        String str1 = scanner.nextLine();

        System.out.println(str1.replace(" ", ""));
    }
}
