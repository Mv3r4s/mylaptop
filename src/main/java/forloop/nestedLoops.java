package forloop;

public class nestedLoops {
    public static void main(String[] args) {
        /*
        nested lop - loops inside loops
         */
        for (int a = 1; a <= 10; a++) {
            for (int b = 1; b <= 10; b++) {
                System.out.print((a * b) + " \t");
            }
            System.out.println();
        }
        //////////////////////////


        for (int a = 1; a <= 5; a++) {
            for (int b = 1; b <= a; b++) {
                System.out.print(("*") + " \t");
            }
            System.out.println();
        }


        //////////////////xmas three
        for (int x = 1; x <= 6; x++) {
            for (int y = 1; y <= x; y++) {
                System.out.print(("*") + "\t");
            }
            for (int y = 1; y <= x; y++) {
                System.out.print(("*") + "\t");
                System.out.println();
            }
        }
    }
}


