package methods;

public class upto {
    public static int sumUpTo(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        return sum;

    }

    public static void main(String[] args) {
        System.out.println(sumUpTo( 100));
    }
}
