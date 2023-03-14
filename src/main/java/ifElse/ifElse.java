package ifElse;

public class ifElse {
    public static void main(String[] args) {
  /* create 3 booleans with numbers and 7 booleans with strings*/

        boolean b1 =  60 <= 80;
        boolean b2 =  70 >= 69;
        //boolean b3 = 50 == 50;
        ////////////////////////////////////////////
        if (b1 = true ) {
            System.out.println(" 60 is less than 80");
        }
        else {
            System.out.println("60 is not more than 80");
        }


        ///////////////////////////////////////////////
        if (b1 == b2 ){
            System.out.println("they are equal");
        }
        else {
            System.out.println("false");
        }
        //System.out.println(b1);
        //System.out.println(b2);
        //System.out.println(b3);



        String str1 = "The weather is good ";
        if (str1.startsWith("T")){
            System.out.println("my sentence start with T");
        }else {
            System.out.println("my sentence do not start with T");
        }

        //boolean s1 = str1.startsWith("t");
        //System.out.println(s1);

        String str2 = "Apple is a fruit";
        if (str2.contains("Apple")) {
            System.out.println("Apple is a fruit");
        }

        //boolean s2 = str2.endsWith("o");
        //System.out.println(s2);
        //int number1 = 500;
        //int number2 = 100;









        /*String str3 = "Tomorrow is sunday";
        boolean s3 = str3.isEmpty();
        System.out.println(s3);

        String str4 = "what's your name?";
        boolean s4 = str4.endsWith("?");
        System.out.println(s4);

        boolean s5 = s3 == s2;
        System.out.println(s5);*/














    }
}
