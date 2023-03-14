package whileDoLoop;

public class DoWhileLoop {
    public static void main(String[] args) {

        int i = 20;

        do {
            System.out.println(i);
            i++;
        }while (i <= 10);

        /*
        using do while loop print odd numbers from 1 to 100
         */

        int number = 1;

        do {
            if (number % 2 != 0){
                System.out.println(number);
            }
            number++;
        }while (number <= 100);



    }
}
