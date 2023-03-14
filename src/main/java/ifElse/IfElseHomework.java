package ifElse;

public class IfElseHomework {
    public static void main(String[] args) {

        /* 1. Write a program that checks whether the number is positive, negative, or zero.
        // The program should print out a message indicating the result.*/
        int number = 40;
        if (number >= 80) {
            System.out.println("the weather today is hot " + number);
        } else if (number <= 79 && number >= 35) {
            System.out.println("the weather is nice " + number);
        } else if (number <= 34 && number >= 1) {
            System.out.println("the weather is cold " + number);
        } else if (number <= 0) {
            System.out.println("the weather is freezing " + number);
        } else System.out.println("invalid input");


        /* 2. Write a program that  checks whether the year is a leap year or not.
        A year is a leap year if it is divisible by 4 but not divisible by 100, or if it is divisible by 400.
        The program should print out a message indicating the result.*/

        int year = 2019;

        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + " is a leap year");
        } else if (year % 400 == 0) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }

        //3. Write a program that checks which int is larger.
        // The program should print out a message indicating the result.

        int num1 = 3;
        int num2 = 123;
        if (num1 > num2) {
            System.out.println(num1 + " num1 is larger");
        } else {
            System.out.println(num2 + " num2 is larger");

        //4. Write a program that checks whether the temperature is below freezing
        // (32 degrees or lower), above boiling (212 degrees or higher), or in between.
        // The program should print out a message indicating the result.

            double tempInFahrenheit = 77.3;
            if (tempInFahrenheit <= 32) {
                System.out.println("the temp in Fahrenheit is freezing " + tempInFahrenheit);
            } else if (tempInFahrenheit >= 212) {
                System.out.println("the temp in Fahrenheit is fire " + tempInFahrenheit);
            } else if (tempInFahrenheit <= 211 && tempInFahrenheit >= 33) {
                System.out.println("the temp in Fahrenheit is hot " + tempInFahrenheit);
            } else { System.out.println("invalid input");}


        // 5. Write a program that checks the months and tells which season it is
        // (winter, spring, summer, or fall). Assume that winter starts in December,
        // spring starts in March, summer starts in June, and fall starts in September.
        // The program should print out a message indicating the result
            String month = "january";
            if (month.equalsIgnoreCase("December") || month.equalsIgnoreCase("January") || month.equalsIgnoreCase("February")) {
                System.out.println("The season is winter.");
            } else if (month.equalsIgnoreCase("March") || month.equalsIgnoreCase("April") || month.equalsIgnoreCase("May")) {
                System.out.println("The season is spring.");
            } else if (month.equalsIgnoreCase("June") || month.equalsIgnoreCase("July") || month.equalsIgnoreCase("August")) {
                System.out.println("The season is summer.");
            } else if (month.equalsIgnoreCase("September") || month.equalsIgnoreCase("October") || month.equalsIgnoreCase("November")) {
                System.out.println("The season is fall.");
            } else {System.out.println("Invalid input.");}




        }
    }
}
