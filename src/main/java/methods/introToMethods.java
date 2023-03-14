package methods;

public class introToMethods {

    double getperimeterOfTriangule(double a, double b, double c) {
        return a + b + c;
    }

    int getlenghtOfFruts(String str) {
        return str.length();
    }

    public static void main(String[] args) {
        introToMethods intro = new introToMethods();
        System.out.println(intro.getperimeterOfTriangule(8.4, 4.6, 3.6));


    }
}



