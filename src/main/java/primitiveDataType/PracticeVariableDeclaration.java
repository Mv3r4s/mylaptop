package primitiveDataType;

public class PracticeVariableDeclaration {
    public static void main (String []args ) {
        /* int myNumber = 100; //declared variable
         number =30 ; //(reassign value)
        number = 0; */

        ///////// declared and assign value to variable
        short pencil =10000;
        short book = 15000;
        short backPack = 20000;
        short marker = 30000;
        short shoes = 32000;

        ////////  Reassign
        pencil = 15000;
        book = 10000;
        backPack= 50;
        marker= 60;
        shoes= 5000;

        ////////// Print variable
        System.out.println(pencil);
        System.out.println(book);
        System.out.println(backPack);
        System.out.println(marker);
        System.out.println(shoes);

        ////////////
        byte byteNumber =10;
        short shortNumber = 2 ;
        int intNumber = 40;
        long longNumber= 30;

        ///// small number into big number
        longNumber = byteNumber;

        ///// CASTING = big number into small variable
        intNumber = (int) longNumber;
        byteNumber = (byte) intNumber;
        shortNumber = (byte)longNumber;
        System.out.println(shortNumber);

        longNumber = 32000;
        shortNumber = (short) longNumber;
        System.out.println(shortNumber);
    }
}
