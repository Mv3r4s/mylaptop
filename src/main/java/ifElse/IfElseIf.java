package ifElse;

public class IfElseIf {
    public static void main(String[] args) {

      /*  if (2 < 5) {
            System.out.println("2 is less than 5");
        } else if (2 > 5) {
            System.out.println("2 is more than 5");
        }*/


        // if usurname and password are correct ==>logged in
        // if usurname is correct, but password incorrect ==> incorrect password
        // if usurname is incorrect, dont check password ==> usurname dont exist
        // usurname is correct email is correct,but password is incorrect ==> recover password


        String actualUsername = " Sunshine123";
        String actualPassword = " moonlight456!true";
        String actualEmail = " Sunshine123@gmail.com";

        String enteredUsername = " Sunshine12e";
        String enteredPassword = " moonlight456!true";
        String enteredEmail = " sunshine123@gmail.com";

        //// if username and password are correct ==>logged in
        //// if username is correct, but password incorrect ==> incorrect password
        if (enteredUsername.equals(actualUsername)) {
            if (enteredPassword.equals(actualPassword)) {
                System.out.println("logged in");
            } else {
                System.out.println("Incorrect password.");

            }
        }
        //// if username is incorrect, don't check password ==> username dont exist
        if (!enteredUsername.equals(actualUsername)) {
            System.out.println("username don't exist");

            //// username is correct email is correct,but password is incorrect ==> recover password
        }
        if (enteredUsername.equals(actualUsername)) {
            if (enteredEmail.equals(actualEmail)) {
                if (enteredPassword.equalsIgnoreCase(actualPassword)) {
                    System.out.println("recover password");
                }
            }


        }


        }
    }








