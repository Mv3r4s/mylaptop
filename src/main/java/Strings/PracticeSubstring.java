package Strings;

public class PracticeSubstring {
    public static void main(String[] args) {

        String message = "Hello Chicago, why are you cold and windy?";

        String city = message.substring(6, 13);
        System.out.println(city);

        String question = message.substring(15);
        System.out.println(question);

        String welcomeSign = "Welcome to USA, our population is 140 million people, " +
                "the average salary is 90k dollars, and our president is Joe Biden";

        /*
        country = USA
        population = 140 million
        salary = 90k dollars
        president = Joe Biden
         */

        //String country = welcomeSign.substring(11, 14);
        String country = welcomeSign.substring(welcomeSign.indexOf("U"), welcomeSign.indexOf(","));
        System.out.println(country);

        String population = welcomeSign.substring(welcomeSign.indexOf("140"), welcomeSign.indexOf(" people"));
        System.out.println(population);

        String salary = welcomeSign.substring(welcomeSign.indexOf("9"), welcomeSign.indexOf(" and") - 1);
        System.out.println(salary);

        String president = welcomeSign.substring(welcomeSign.indexOf("Joe"));
        System.out.println(president);


        String phrase = "Just one positive thought in the morning can change your whole day.";

        /*
        1. using substring method, print  ===> Just a thought
        2. using substring method, print  ===> positive morning
        3. using substring method, print  ===> whole morning
        4. using substring method, print  ===> change one day
        5. using substring method, print  ===> change your thought
         */

        String thought = phrase.substring(18, 25);

        System.out.println(phrase.substring(0, 4) + " a " + phrase.substring(18, 25));

        int beginIndex = phrase.indexOf("p"); //9
        int endIndex = phrase.indexOf(" thought");    //17

        System.out.println(phrase.substring(beginIndex, endIndex));

//    ===================== NEW ASSIGNMENT ================

        String str1 = "hi";
        String str2 = "bye";

        /*
        print: hibyebyehi
         */
        System.out.println(str1 + str2 + str2 + str1);

        //print =======>       hi bye HI HI BYE BYE bye hi
        System.out.println(str1 + " " + str2 + " " + str1.toUpperCase() + " " + str1.toUpperCase() +
                " " + str2.toUpperCase() + " " + str2.toUpperCase() + " " + str2 + " " + str1);

        //print ====> bi
        System.out.println(str2.substring(0, 1) + str1.substring(1));
        System.out.println(str1.replace('h', 'b'));
        System.out.println(str2.charAt(0) + "" + str1.charAt(1));


        String see = "see";
        String hear = "hear";

        /*
        print =====>  sear
        1. substring
        2. replace
        3. charAt and substring
         */
        System.out.println(see.substring(0, 1) + hear.substring(1, 4));
        System.out.println(hear.replace('h', 's'));
        System.out.println(see.charAt(0) + hear.substring(1, 4));


    }

    }
