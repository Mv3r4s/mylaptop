package methodOverLoading;

public class Triangle {
    public int getAreaOfTriangle(int base, int height) {
        return (base * height) / 2;
    }

    public int getAreaOfTriangle(int a, int b, int c) {
        int s = (a + b + c) / 2;
        int area = (int) Math.sqrt(s * (s - a) * (s - b) * (s - c));
        return area;
    }
}

