package Practice;

import java.util.Scanner;

public class replace {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("introduce any string");
        String str = sc1.next();

        String outputString = str.replaceAll("[aeiouAEIOU]", "x");
        System.out.println(outputString);
    }
}
