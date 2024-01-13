package OOP.polymorphism;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Bear bear = new Bear();
        bear.animalSound();

        Cow cow =  new Cow();
        cow.animalSound();

        Horse horse = new Horse();
        horse.animalSound();

        LocalDate myObj = LocalDate.now(); // Create a date object
        System.out.println(myObj);




    }

    static int calMain(int a, int b){
        return a + b;
    }

    static double calMain(double a, double b){
        return a + b;
    }
}
