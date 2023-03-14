package Strings.Homework;

public class tringManipulationHomework2 {
    public static void main(String[] args) {
    //1-Write a program that prints out the index of the first occurrence of the word "world" in the string "Hello world" using the indexOf method.
        String Hellow = "Hello world";
        System.out.println(Hellow.indexOf('w')) ;

    //2-Write a program that prints the first letter of the string "Hello" using the charAt method.
        String hello = "Hello";
        System.out.println(hello.charAt(0));

    //3-Write a program that prints the string "HELLO" in all lowercase using the toLowerCase method.
        String uc = "HELLO";
        System.out.println(uc.toLowerCase());

    //4-Write a program that prints the string "hello" in all uppercase using the toUpperCase method.
        String lc = "hello";
        System.out.println(lc.toUpperCase());

    //5-Write a program that checks if the strings "hello" and "Hello" are equal or not using the equals method.
        String str1 = "hello";
        String str2 = "Hello";
        boolean isEqual = str1.equals(str2);
        System.out.println(isEqual);

    //6-Write a program that prints a new string with the first letter of each word in the string "the quick brown fox"
    // capitalized using the substring, toUpperCase, and toLowerCase methods.
        String newl = "the quick brown fox";
        newl = newl.replace("t", "T");
        System.out.println(newl.substring(0, 1) + newl.substring(4, 5) + newl.substring(10, 11)+ newl.substring(16, 17) );



    //7-Write a program that prints the string "Hello" in reverse order using the charAt method.
        String h1 = "Hello";
        char o = h1.charAt(4);
        char l = h1.charAt(3);
        char l1 = h1.charAt(2);
        char e = h1.charAt(1);
        char h = h1.charAt(0);
        System.out.println( "" + o + l +l1 + e + h );

     //8- Write a program that counts the number of vowels in the string "Hello World" using the charAt and toLowerCase methods.
        String wd = "Hello World";
        String vowels = (wd.charAt(1) + "" + wd.charAt(4 ) + "" + wd.charAt(7));
        System.out.println(vowels);

    //9-Write a program that concatenates the strings "Hello" and "World" using the concat method and prints the resulting string.
        String aa = "Hello";
        String ee = "World";
        String helloWorld = aa + " " + ee;
        System.out.println(helloWorld);

    //10-Write a program that checks if the strings "hello" and "HELLO" are equal ignoring case using the equalsIgnoreCase method.
        String qq = "hello";
        String ww = "HELLO";
        boolean isEqual_ = qq.equalsIgnoreCase(ww);
        System.out.println(isEqual_);

    //11-Write a program that prints the length of the string "Hello World" using the length method.
        String hw = "Hello World";
        int length = hw.length();
        System.out.println(length);

    //12-Write a program that prints the third character of the string "Hello" using the charAt method.
        String tt = "Hello";
        char uu = tt.charAt(2);
        System.out.println(uu);

    //13-Write a program that prints out the index of the first occurrence of the letter "l" in the string "Hello World" using the indexOf method
        String ad= "Hello World";
        int index = ad.indexOf('l');
        System.out.println(index);

    //14- Write a program that checks if the string "hello" and "hello" are equal using both the == and equals methods.
        String hi = "hello";
        String h2 = "hello";

        System.out.println(hi == h2);
        System.out.println(hi.equals(h2));

    //15- Write a program that checks if the string "hello" and "HELLO" are equal using both the == and equals methods.
        String h3 = "hello";
        String h4 = "HELLO";

        System.out.println(h3 == h4);
        System.out.println(h3.equals(h4));

    //16- Write a program that prints the string "HELLO WORLD" in all lowercase using the toLowerCase method.
        String lx = "HELLO WORLD";
        System.out.println(lx.toLowerCase());

    //17- Write a program that prints the string "hello world" in all uppercase using the toUpperCase method.
        String lo = "hello world";
        System.out.println(lx.toUpperCase());

    //18- Write a program that replaces all occurrences of the letter "l" with the letter "r" in the string "Hello World" using the replace method.
        String repl = "hello world";
        repl = repl.replace('l', 'r');
        System.out.println(repl);

    //19- Write a program that prints a new string with the first letter of each word in the string "the quick brown fox" capitalized using the substring, toUpperCase, and toLowerCase methods.
        String fl = "the quick brown fox" ;
        System.out.println(fl.toUpperCase().substring(0,1)+ fl.substring(4,5)+fl.substring(10,11)+fl.substring(16,17) );
        System.out.println("thanks");


    }
}
