package forloop;

public class DoWhileLoop {
    public static void main(String[] args) {
        int i = 20;

        do {
            System.out.println(i);
            i++;
        } while (i <= 10);
/*
using do while loop print odd nu
 */
        int x = 1;

        do {
            if (x % 2 != 0) {
                System.out.println(x);
            }
            x++;
        } while (x <= 100);
    }
}
