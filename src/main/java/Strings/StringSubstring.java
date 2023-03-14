package Strings;

public class StringSubstring {
    public static void main(String[] args) {
        String message = "Hello Chicago, why are you so cold and windy?";
        String city = message.substring(6 , 13);
        System.out.println(city );

        String Question = message.substring(15);
        System.out.println(Question);

        String WelcomeSign = "Welcome to USA, our population is 140 million people," + "the average salary is 90k dollars, " +
                "our president is Joe Biden" ;

        //country = USA
        //Population = 140 million
        //salary = 90k dollar
        //president = Joe Biden

        String country = WelcomeSign.substring(11 , 14);
        String population = WelcomeSign.substring(35 , 52);
        String salary = WelcomeSign.substring(74 , 87);
        String president = WelcomeSign.substring(105 , 114);

        System.out.println("Country: " + country);
        System.out.println("Population: " + population);
        System.out.println("Salary: " + salary);
        System.out.println("President: " + president);

        String phrase = "just one positive thought in the morning can change your whole day.";

        // just a thought
        System.out.println(phrase.substring(0,5) + " a " + phrase.substring (18 , 26));


        // positive morning
        System.out.println(phrase.substring(9, 18)  + phrase.substring(32, 41));


        // whole morning
        System.out.println(phrase.substring(57, 63)  + phrase.substring(32, 41));


        // change one day
        System.out.println(phrase.substring(45, 51) + phrase.substring(4, 9)  + phrase.substring(63, 66));


        // change your thought
        System.out.println(phrase.substring(45, 51) + phrase.substring(57, 60)  + phrase.substring (18 , 26));


        String str1 = "hi";
        String str2 = "bye";

        //print hi bye HI HI BYE BYE bye hi

        System.out.println(str1 + " " + str2 + " " + str1.toUpperCase() + " " + str1.toUpperCase() +
                " " + str2.toUpperCase() + " " + str2.toUpperCase() + " " + str2 + " " + str1);

        String see = "see";
        String hear = "hear";

        // print sear

        //substring
        System.out.println( see.substring(0,2) + hear.substring(2,4));

        // replace
        System.out.println( see.replace('h', 's'));
















    }
}
