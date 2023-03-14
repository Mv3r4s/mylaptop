package methods;

public class Calculator {
    public int sum(int x, int y) {
        return x + y;
    }

    public int subt(int x, int y) {
        return x - y;
    }

    public int mult(int x, int y) {
        return x * y;
    }

    public double div(int x, int y) {
        if (y == 0 || x==0) {
            System.out.print("Please enter int >1");
        }
        return (double) x / y;
    }

}
