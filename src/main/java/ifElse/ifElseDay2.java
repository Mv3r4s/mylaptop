package ifElse;

public class ifElseDay2 {
    public static void main(String[] args) {
        int day = 3;

        if (day == 3 ){
            System.out.println("Wednesday");
        } else if (day == 2 ) {
            System.out.println("Tuesday");
        } else if (day == 1 ) {
            System.out.println("Monday");
        } else if (day == 4 ) {
            System.out.println("thrusday ");
        } else if (day == 5 ) {
            System.out.println("Friday");
        } else if (day == 6 ) {
            System.out.println("Saturday");
        } else if (day == 7 ) {
            System.out.println("Sunday");
        } else{
            System.out.println("Invalid  day");
        }
        //////////////////////////////////
        String dayOfWeek ;
        dayOfWeek =("Monday");
        if (dayOfWeek.equalsIgnoreCase("Monday") ){
            System.out.println("1");
        } else if (dayOfWeek.equalsIgnoreCase("Tuesday") ){
            System.out.println("2");
        } else if (dayOfWeek.equalsIgnoreCase("Wednesday") ){
            System.out.println("3");
        } else if (dayOfWeek.equalsIgnoreCase("Thursday") ){
            System.out.println("4");
        } else if (dayOfWeek.equalsIgnoreCase("Friday") ){
            System.out.println("5");
        } else if (dayOfWeek.equalsIgnoreCase("Saturday") ){
            System.out.println("6");
        } else if (dayOfWeek.equalsIgnoreCase("Sunday") ){
            System.out.println("7");
        } else{
            System.out.println("-1");

            /*
            if time is between 9 and 17 - print WORK HOUR
            if time is between 7 and 9 and 18 to 19 -  print COMMUTE HOURS
            if time is between 6 and 8 - print BREAKFAST TIME
            if time is  between 12 and 13 - Print LUNCH TIME
            if time is  between 20 and 22 - print DINNER TIME
            if time is  between  22 and 24 - print LATE HOURS
            if time is  between 0 and 6 - print SLEEP TIME
             */
            int hour = 12 ;

            if (hour >= 9 && hour <= 17) {
                System.out.println("WORK HOUR");
            } else if ((hour >= 7 && hour < 9) || (hour >= 18 && hour <= 19)) {
                System.out.println("COMMUTE HOURS");
            } else if (hour >= 6 && hour < 8) {
                System.out.println("BREAKFAST TIME");
            } else if (hour >= 12 && hour < 13) {
                System.out.println("LUNCH TIME");
            } else if (hour >= 20 && hour <= 22) {
                System.out.println("DINNER TIME");
            } else if (hour >= 22 || hour < 6) {
                System.out.println("LATE HOURS");
            } else if  (hour >= 0 && hour <= 6) {
                System.out.println("SLEEP TIME");
            } else
                System.out.println("INVALID TIME");

            }
        }
    }

