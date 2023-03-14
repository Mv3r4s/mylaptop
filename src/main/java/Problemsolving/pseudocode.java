package Problemsolving;

import java.util.Scanner;

public class pseudocode {
    public static void main(String[] args) {
        /*
        1.using Scanner, create String and get String from the user
        2.create counter
        3.create for loop which starts from 0 up to length of string
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Word");
        String word = sc.nextLine();

        int counter= 0 ;
        for (int i = 0; i <word.length(); i++){
            for (int k=0 ; k<word.length(); k++) {
                if (word.charAt(i)== word.charAt(k)){
                    counter++;
                }
            }System.out.println(word.charAt(i)+ ":"+ counter);
        }

    }
}
