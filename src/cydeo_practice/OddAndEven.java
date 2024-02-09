package cydeo_practice;

import java.util.SortedMap;

public class OddAndEven {
    public static void main(String[] args) {
        System.out.println("TOQ");
        System.out.println(isOdd(55));
        System.out.println(isOdd(56));

        System.out.println("\nJUFT");
        System.out.println(isEven(16));
        System.out.println(isEven(17));

    }

    static boolean isOdd(int number){
        int toq = number % 2;

        if (toq == 1){
            return true;
        }

        return false;

        // return number % 2 == 1;
    }

    static boolean isEven(int number){
        int JUFT = number % 2;

        if (JUFT == 0){
            return true;
        }
        return false;

        // return number % 2 == 0
    }
}
