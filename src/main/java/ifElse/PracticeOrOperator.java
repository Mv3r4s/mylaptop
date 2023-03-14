package ifElse;

public class PracticeOrOperator {
    public static void main(String[] args) {
        String menu = "pizza lagman tea bread cake coffe water" ;
        /*

         */

        if (menu.contains("pizza") && menu.contains("soda")) {
            System.out.println("Order pizza and soda!");
        }
        if (menu.contains("tea") && menu.contains("cake")) {
            System.out.println("Order dessert");
        }
        if (menu.contains("lagman") && menu.contains("tea")) {
            System.out.println("Order lagman and tea. asian is here!");
        }
        if (menu.contains("coffee") || menu.contains("smoothie")) {
            System.out.println("Breakfast time");
        }
        if (menu.contains("pizza") || menu.contains("pasta")) {
            System.out.println("italian day");
        }
        if (menu.contains("tea") && menu.contains("coffee") && menu.contains("water")  && menu.contains("soda") ) {
            System.out.println("Order only drinks");
        }
        if (menu.contains("lagman") && !menu.contains("plov")) {
            System.out.println("This is not an Uzbek dish.");

        }

    }
    }
