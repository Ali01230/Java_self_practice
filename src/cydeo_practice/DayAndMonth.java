package cydeo_practice;

public class DayAndMonth {

    public static void main(String[] args) {
        days(5);
        days(9);
        days(2);
        monthName(7);
        monthName(16);
        daysInMonth(9);
        daysInMonth(3);
        daysInMonth(14);



    }

    static int days (int number) {
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        if (number >= 1 && number <= 7) {

            System.out.println(days[number-1]);

        } else {

            System.out.println("Invalid Number");
        }
        return number;
    }

    static int monthName (int number) {
        String[] monthNames = {"january", "february", "march", "april", "may", "june", "july", "august", "september", "november", "december"};
        if (number >= 1 && number <= 12) {
            System.out.println(monthNames[number - 1]);
        } else {
            System.out.println("Invalid Number");

        }
        return number;
    }

    static int daysInMonth (int number){
        String[] daysInMonths = {"january has 30 days", "february has 31 days", "march has 30 days", "april has 31 days", "may has 30 days", "june has 31 days", "july has 30 days", "august has 31 days", "september has 30 days", "october has 31 days", "november has 30 days", "december has 31 days"};
        if (number >=1 && number<=12){
            System.out.println(daysInMonths[number -1]);
        }else {
            System.out.println("Invalid Number");
        }
        return number;
    }


    }




