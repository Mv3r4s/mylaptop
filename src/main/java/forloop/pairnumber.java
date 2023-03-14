package forloop;

public class pairnumber {
    public static void main(String[] args) {
        int sum = 0;
        for (int k = 2; k <= 100; k+=2) {
            System.out.println("The even numbers are:" + k);
            sum = sum + k ;
        }
        System.out.println("the sum of all value: " + sum );
    }
}
