package arithmeticOperators;

public class OperatorsHomework {
    public static void main(String[] args) {
        /*   1) given: int a = 100; int b = 200; write a program that will print the sum of two variables. */
        int a = 100;
        int b = 200;
        int sum = a + b;
        System.out.println("the sum of a and b: " + sum);


/*   2) given int q = 5; int w = 9, int e = 10;
-write a program that will print the sum of all three variables. */
        int q = 5;
        int w = 9;
        int e = 10;
        int suma = q + w + e;
        System.out.println(q + "+" + w + "+" + e + "=" + suma);

        /*   3) using operators and variables, write a program that will print following lines of code: */
        int G = 1;
        int k = 2;
        int L = 3;
        int M = 4;
        int N = 7;
        int R = 8;
        int z = 10;
        int GK = G + k;
        int LG = L - G;
        int kk = k * k;
        int Mk = M / k;
        int kR = k + R;
        int zN = z % N;


        System.out.println(G + " + " + k + " = " + GK);
        System.out.println(L + " - " + G + " = " + LG);
        System.out.println(k + " * " + k + " = " + kk);
        System.out.println(M + " / " + k + " = " + Mk);
        System.out.println(k + " + " + k + " = " + kR);
        System.out.println(z + " % " + N + " = " + zN);

/*   4) Length and width of a rectangle are 9 and 15 respectively.
Write a program to calculate the area and perimeter of the rectangle. Print results as following: */
        //The area of a rectangle is: A = B * H
        byte len = 9;
        byte wid = 15;
        int area = len * wid;
        int perimeter = 2 * (len + wid);
        System.out.println("The area of a rectangle is: " + area);
        //The perimeter of rectangle is: */
        System.out.println("The perimeter of rectangle is: " + perimeter);

/*   5) Write a program to add 8 to the number 2345 and then divide it by 3.
Now, the modulus the total sum with 5 and then multiply the result value by 5. Print the final result as following: */
        int o = (8 + 2345 / 3) % 5 * 5;
        System.out.println(a);

        int O2 = 8;
        O2 += 2345;
        O2 /= 3;
        O2 %= 5;
        O2 *= 5;

        System.out.println(O2);


        /*    Now, solve the above question using compound operators (eg. +=, -=, *=). */


        /*  7) Write a program to check if the two numbers 23 and 45 are equal. */
        int mango = 23;
        int Strawberry = 45;

        boolean IsEqual2 = 23 == 45;

        System.out.println(IsEqual2);



        /*  8) Write a program to check if the two numbers -10 and 10 are equal.*/
        int num3 = -10;
        int num4 = 10;

        boolean isEqual = -10 == 10;

        System.out.println(isEqual);

    }



}
