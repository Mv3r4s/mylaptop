package Strings.Homework;

public class PracticeEquals {
    public static void main(String[] args) {

        String hello1 = "Hello World!";
        String hello2 = "Hello world!";
        String hello3 = new String("HelloWorld!");

        // 1. compare values of hello1 and hello2, and result in true
        System.out.println(hello1.equalsIgnoreCase(hello2));

        // 2. compare values of hello1 and hello3, and result in false
        System.out.println(hello1.equals(hello3));

        // 3. compare values of hello1 and hello2, and result in false
        System.out.println(hello1.equals(hello2));

        // 4. convert hello1 and hello2 to all lower case and compare them
        System.out.println(hello1.toLowerCase().equals(hello2.toLowerCase()));

        // 5. convert hello1 and hello3 to upper case and compare them
        System.out.println(hello1.toUpperCase().equals(hello3.toUpperCase()));
    }
}