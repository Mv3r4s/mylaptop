package Strings;

public class StringCharAt {
    public static void main(String[] args) {
        String WelcomeSign = "Hello everyone! Welcome to chicago";
        char c = WelcomeSign.charAt(14);
        System.out.println(c);

        char cc = WelcomeSign.charAt(2);
        System.out.println(cc);

        //print the last letter using charAt and length methods
        int length = WelcomeSign.length();
        System.out.println(WelcomeSign.charAt(-1));



    }
}
