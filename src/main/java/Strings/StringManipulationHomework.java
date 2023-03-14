package Strings;

public class StringManipulationHomework {
    public static void main(String[] args) {
        String message = "Hello everyone, Let's do Java String exercises";

        //1. write a program that will create a following output: The character at position 10 is y
        System.out.println("The character at position 10 is " + message.charAt(10));
        //2. print out the length of the String message
        System.out.println("The length of the string is " + message.length());
        //3. print out the String message all in uppercase
        System.out.println(message.toUpperCase());
        //4. print out the String message all in lowercase
        System.out.println(message.toLowerCase());
        //5. print only letter #5
        System.out.println("Letter #5 is " + message.charAt(4));
        //6. print only last letter
        System.out.println("The last letter is " + message.charAt(message.length()-1));
        //7. print first letter in lowercase
        System.out.println("The first letter in lowercase is " + Character.toLowerCase(message.charAt(0)));
        //8. print last letter in uppercase
        System.out.println("The last letter in uppercase is " + Character.toUpperCase(message.charAt(message.length()-1)));
}

}
