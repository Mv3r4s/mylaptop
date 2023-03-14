package Strings;

public class StringManipulationHW2 {
    public static void main(String[] args) {
        /*
        1.Check if a given String ends with a specific substring.
        2.Extract a substring from a given String starting from a specific index.
        3.Replace all occurrences of a specific substring in a given String.
        4.Retrieve the substring between two specific indexes in a given String.
        5.Find the index of the last character in a given String.
        6.Check if a given String starts with a specific substring.
        7.Replace the first occurrence of a specific character in a given String.
        8.Retrieve the index of the nth occurrence of a specific character in a given String.
        9.Remove all whitespace characters from a given String.
        10.Convert all the characters in a given String to uppercase.
         */
        String Str = "life is nice to be worry about things with cant control";
        String Str2  = "Dog best friend";
        char char1 = 'o';
        int ind = 3;
        int  ind1 = 2;

        // Check if the given string ends with a specific substring
        System.out.println(Str.endsWith("l"));

        // Extract a substring from a given string starting from a specific index
        System.out.println(Str2.substring(9, 15));

        // Replace all occurrences of a specific substring in a given string
        System.out.println(Str2.replaceAll("Dog best friend", "I need more time to do my homework"));

        // Retrieve the substring between two specific indexes in a given string
        System.out.println(Str2.substring(4,9));

        // Find the index of the last character in a given string
        System.out.println(Str2.length()-1);

        // Check if a given string starts with a specific substring
        System.out.println(Str.startsWith("Life"));

        // Replace the first occurrence of a specific character in a given string
        System.out.println(Str2.replace("o","p"));

        // Remove all whitespace characters from a given string
        System.out.println(Str.replace(" ", ""));

        // Convert all the characters in a given string to uppercase
        System.out.println(Str2.toUpperCase());

    }
}

