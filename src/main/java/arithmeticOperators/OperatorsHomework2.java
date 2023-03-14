package arithmeticOperators;

public class OperatorsHomework2 {
    public static void main(String[] args) {
    /* 1. Write a program that calculates the sum of two integers, a and b, where a is 7 and b is 12. */
        // Expected output: The sum of 7 and 12 is 19.
        int a = 12;
        int b = 7 ;
        int sum = a + b ;
        System.out.println("The sum of 7 and 12 is: " + (sum));

    /* 2. Write a program that calculates the difference between two integers, a and b, where a is 15 and b is 8.*/
        // Expected output: The difference between 15 and 8 is 7.
        a = 15;
        b = 8;
        int dif = a - b;
        System.out.println("The difference between" + a + " and "+ b + " is " + dif);

    /* 3. Write a program that calculates the product of three integers, a, b, and c, where a is 3, b is 5, and c is 7.*/
        // Expected output: The product of 3, 5, and 7 is 105.
        a = 3;
        b = 5;
        int c = 7;
        int prod = a * b * c;
        System.out.println("The product of " + a + ", " + b + ", and " + c + " is " + prod);

    /* 4. Write a program that calculates the division of two integers, a and b, where a is 20 and b is 5.*/
        // Expected output: The division of 20 by 5 is 4.
        a = 20;
        b = 5;
        int div = a / b;
        System.out.println("The division of " + a + " by " + b + " is " + div);

    /* 5. Write a program that calculates the remainder of two integers, a and b, where a is 27 and b is 4.*/
        //  Expected output: The remainder of 27 divided by 4 is 3.

        a = 27 ;
        b = 4 ;
        int remain = a % b;
        System.out.println("The remainder of " + a +  " divided by " + b + " is " + remain);

    /* 6. Write a program that calculates the result of raising an integer, a, to a power of b, where a is 2 and b is 5.*/
        // Expected output: 2 raised to the power of 5 is 32.
         a = 2;
         b = 5;
        double result = Math.pow(a, b);
        System.out.println(a + " raised to the power of " + b + " is " + result);

    /* 7. Write a program that calculates the average of three integers, a, b, and c, where a is 10, b is 15, and c is 20.*/
        // Expected output: The average of 10, 15, and 20 is 15.
        a =  10;
        b = 15;
        c = 20;
        int media = (( a + b + c ) / 3);
        System.out.println( "The average of " + a + ", " + b  +" and " + c + " is " + media );

    /* 8. Write a program that calculates the area of a rectangle given its length and width, where the length is 5 and the width is 8.*/
        // Expected output: The area of a rectangle with length 5 and width 8 is 40.
        int l = 5;
        int w = 8;
        int area = l * w;
        System.out.println("The area of a rectangle with length " + l + " and" + w + " is " + area);

    /* 9. Write a program that calculates the perimeter of a square given its side length, where the side length is 6.*/
        // Expected output: The perimeter of a square with side length 6 is 24.

        int sideLength = 6;
        int perimeter = sideLength * 4 ;
        System.out.println("The perimeter of the square with side length " + sideLength + " is " + perimeter);
    }
}
