package Strings;

public class IntroToStrings {
    public static void  main (String []args ){
        String city = "London";
        System.out.println(city);

        String city2 = new String("New York");
        System.out.println(city2);

        //==========================================

        System.out.println(city.length()); //6
        System.out.println(city2.length()); //8
        /*
        length() method returns us the number of chars in String
         */

        String name = "Antananarivo";
        System.out.println("The length of Antananarivo is: " + name.length());


        System.out.println("Madrid");

        System.out.println(true);

        System.out.println(234);

        int b = 234;


        String school = "Codewise";
        school = "Codewise Academy";

        /*
        equals() method compares values of 2 Strings
         */

        String fruit1 = "apple";
        String fruit2 = "apple";
        String fruit3 = "Apple";

        boolean isSame = fruit1.equals(fruit2);
        System.out.println(isSame); //true

        isSame = fruit1.equals(fruit3);
        System.out.println(isSame); //false

        fruit1 = "banana";
        fruit2 = "orange";

        System.out.println("Is banana same as orange? " + fruit1.equals(fruit2)); //false

        boolean isSame2 = !fruit1.equals(fruit2); //not equals, TRUE
//        fruit1.equalsIgnoreCase()

        String state1 = "California";
        String state2 = "Illinois";
        String state3 = "Florida";
        String state4 = "ILlinois";
        String state5 = "florida";
        // equalsIgnoreCase(), equals(), ! equals()
        /*
        create boolean variable for every comparison, and print

        compare state1 with state2 ==> true
        compare state2 with state4 ==> true
        compare state3 with state5 ==> false
        compare state5 with state1 ==> false
        compare state4 with state3 ==> true
         */

        boolean vv = (!state1.equals(state2));
        System.out.println(vv);

        boolean bbr = (state2.equalsIgnoreCase(state4));
        System.out.println(bbr);

        boolean bbb = (state3.equals(state5));
        System.out.println(bbb);

        boolean uuu = state5.equals(state1);
        System.out.println(uuu);

        boolean ppp = !state4.equals(state3);
        System.out.println(ppp);

        System.out.println(ppp + " " + uuu + " " + bbb);

        /*
        london   .equals            LONDON    => false
        chicago   .equalsIgnoreCase  LONDON  ==> false
         */












        int cucumber = 5;
        int tomato = 10;

        int empty = cucumber; //5
        cucumber = tomato; //10
        tomato = empty; //5


        System.out.println("cucumber: " + cucumber); //cucumber: 10
        System.out.println("tomato: " + tomato); //tomato: 5


        //===========================


        int aa = 5;
        int bb = 10;

        int cc = aa;
        aa += aa;  //10
        bb -= cc;  //5


        System.out.println("aa: " + aa);
        System.out.println("bb: " + bb);



        // create string myName, myMiddleName, myLastName, age, address, mobileNumber, friendName, city;


        String myName = "Mario";
        String myMiddleName = "Edrison";
        String myLastName = "Veras";
        int age = 27;
        String address = "123 Main St, Jolie, Il USA";
        long mobileNumber = 5415551234l;
        String friendName = "Issa";
        String myCity = "Jolie Il";

        System.out.println("My name is:" + myName);
        System.out.println("My my middle Name is:"+ myMiddleName);
        System.out.println("My last name is:" + myLastName);
        System.out.println("my age is:" + age + "years old");
        System.out.println("my address:" + address);
        System.out.println("my phone number is:" + mobileNumber);
        System.out.println("my friend:" + friendName + "she is very smart :3 ");
        System.out.println(myCity);


        ////////////////////////////
        /* equalsIgnoreCase(), equal(), !equals()
        compare state1 with state2

         */


    }
}


