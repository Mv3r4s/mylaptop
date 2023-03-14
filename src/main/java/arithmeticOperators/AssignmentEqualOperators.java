package arithmeticOperators;

public class AssignmentEqualOperators {
    public static void main(String[] args) {
/*
= assignment operator (when you give value to a variable )
== equal equal operator (compares two variable if they are equal or not)
! = not equal operator (compare if two variable are not equal)
 */
        int number1 = 10 ; // assignment
        int number2 = 8;

        System.out.println(number1 == number2); // false
        System.out.println(100 == 100); // true


        boolean isEqual = 100 == 100 + 1;
        System.out.println(isEqual);

        boolean isEven;
        isEven = 80 % 2 == 0; //true
        isEven = 14324354632430l % 2  == 0 ;

        int usersAge = 89 ;

        System.out.println(usersAge % 2 == 0 );


        /* create 2 bytes, 2 shorts, 2 ints, 2 longs/ assign different value
        - compare bytes with shorts and ints
        -print in booleans, compare in boolean and print
        - compare longs with bytes and ints */

        byte byte1 = 10;
        byte byte2 = 5;
        short short1 = 100;
        short short2 = 200;
        int int1 = 1000;
        int int2 = 3000;
        long long1 = 1900000L;
        long long2 = 7200000L;
        boolean b1 = byte2 == byte1 ;

        System.out.println(byte1 == short1);
        System.out.println(short1 == long1);
        System.out.println(int1 >= int1);
        System.out.println(long2 != int1);
        System.out.println(int1 == long2 + 5);
        System.out.println(byte2 == byte1 - 5);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();










    }
}
