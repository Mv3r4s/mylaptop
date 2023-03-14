package forloop;

import java.util.Scanner;

public class whilepractice {
    public static void main(String[] args) {
        int x = 100;
        while (x >= 1) {
            if (x % 2 != 0) {
                System.out.println(x);
                x--;

            }
            for (int n = 100; n >= 1; n--) {
                if (n % 2 == 1) {
                    System.out.println(n + " ");
                    break;
                }
            }
        }
    }
}






