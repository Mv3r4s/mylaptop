package Strings;

public class StringIndexOf {
    public static void main(String[] args) {
        String ad= "Buy two, get one for free!";
        int index = ad.indexOf('g');
        index = ad.indexOf('t');

        System.out.println(index);
        index = ad.indexOf('t');

        String d = "Buy two, get one for free!";
        index = d.indexOf('g'); //9
        System.out.println(index);

        index = d.indexOf('o', 7);
        index = d.indexOf('o', 10 + 30 - 20);

        System.out.println(index);
        index = d.indexOf('t');


    }
}
