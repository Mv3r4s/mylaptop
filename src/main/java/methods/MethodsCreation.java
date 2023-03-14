package methods;

public class MethodsCreation {
    /*create a public static method wich take 2 ints, returns string*/
        public static String concatenateInts(int num1, int num2) {
            String result = Integer.toString(num1) + Integer.toString(num2);
            return result;}

    /*2. create public instance method which takes 1 int, returns boolean false*/
    public boolean takeone (int number) {
        return number > 10;}

    /* 3. create public instance method which does not take anything, returns int 1*/
    public int donttake() {
        return  1;
    }
    /* 4. create static method which takes 1 String, returns double 1.8*/
    public static double convStr (String str1) {
        return 8.8;
    }
    /* 5. create instance method which takes nothing, returns nothing*/
    static void  nothing (){

    }
    /*6. create static method which takes 3 ints, returns nothing*/
     static void  threeint (int a, int b, int c){

    }
    /*7. create public instance method which takes 2 Strings and returns short*/
    public short returnshort (String str1, String str2) {
        return 1;
    /*8. create instance method which takes 1 int, returns 1 byte*/


    }
}
