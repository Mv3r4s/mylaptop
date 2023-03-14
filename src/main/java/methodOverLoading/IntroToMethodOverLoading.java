package methodOverLoading;

public class IntroToMethodOverLoading {
    public int getAreaOfRectangle(int lenght, int width) {
        return lenght * width;
    }

    public int getAreaOfRectangle(long lenght, long width) {
        return (int) (lenght * width);
    }
    /*
  get GetPerimeterOfSquare methods, return type int
    */

    public int GetPerimeterOfSquare(int side) {
        return 4 * side;
    }

    public int getPerimeterOfSquare(int length, int width) {
        return (length + width) * 2;
    }

    public int GetPerimeterOfSquare(long side) {
        return (int) (4 * side);
    }

    public int getPerimeterOfSquare(double length, double width) {
        return (int) (length + width) * 2;
    }


    public boolean isPrime(long num) {
        boolean prime;
        for (int i = 2; i <= num / 2; ++i) {
            if (num % i == 0) {
                prime = true;
                break;
            }
        }
        return false;
    }

    public boolean isPrime(int num) {
boolean prime;
        for (int i = 2; i <= num / 2; ++i) {
            if (num % i == 0) {
                prime = true;
                break;
            }
        }
        return false;
    }
    public boolean isPrime(short num) {
        boolean prime;
        for (int i = 2; i <= num / 2; ++i) {
            if (num % i == 0) {
                prime = true;
                break;
            }
        }
        return false;
    }

}









