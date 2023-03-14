package methodOverLoading;

public class ArithmeticOperations {

    public int sum (int num1, int num2){
        return (num1 + num2);
    }
    public int sum (int num1, int num2 ,int num3) {
        return (num1 + num2 + num3);

    }
    public int average (int num1, int num2 ,int num3 , int num4) {
        return (num1 + num2 + num3 + num4 ) / 4;
    }
    public int average (int num1, int num2 ,int num3 , int num4 , int num5 , int num6) {
        return (num1 + num2 + num3 + num4 + num5 + num6) / 6;
    }

    }

