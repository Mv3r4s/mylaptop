package Strings;

public class StringReplace {
    public static void main(String[] args) {

        String word = "Apple banana strawberry";
        word = word.replace('a', 'e');

        System.out.println(word);

        System.out.println(word.replace('e', 'a'));


        String countries = "Italia Columbia Croatia ";

        System.out.println(countries.replace(" ", " republic. "));

//        ==========================================


        String foods = "hot lentil soup, hot plov, cold kompot, cold ice-cream, warm pasta, warm pizza";

        //replace hot with tasty, print, store in foods
        //replace cold with cool, store in variable and print
        //replace warm with italian, store and print

        foods.replace("hot", "tasty");

        foods = foods.replace("hot", "tasty");
        foods = foods.replace("cold", "cool");
        foods = foods.replace("warm", "italian");


        System.out.println(foods);
        //tasty lentil soup, tasty plov, cool kompot, cool ice-cream, italian pasta, italian pizza


        String letters = "hello everyone, hope you are doing good, i wish you good luck";
        letters = letters.replace('f', 'a');

        System.out.println(letters);

        letters = letters.replace('h', 'a');
        letters = letters.replace('e', 'a');
        letters = letters.replace('l', 'a');
        letters = letters.replace('o', 'a');
        letters = letters.replace('v', 'a');
        letters = letters.replace('r', 'a');
        letters = letters.replace('y', 'a');
        letters = letters.replace('n', 'a');
        letters = letters.replace('p', 'a');
        letters = letters.replace('u', 'a');
        letters = letters.replace('d', 'a');
        letters = letters.replace('g', 'a');
        letters = letters.replace('w', 'a');
        letters = letters.replace('s', 'a');
        letters = letters.replace('k', 'a');
        letters = letters.replace('i', 'a');

        System.out.println(letters); //aaaaa aaa aaaa aaaaa aaaaaaa aaaaaaa aaaaaaa

    }
}


