package Cydeo_classes;

public class PrametersArgumentsIntro {

    public static void main(String[] args) {

        eligibleToVote(25);

        int age = 16;
        eligibleToVote(age);

    }

    public static void eligibleToVote(int age) {
        if (age >= 18) {
            System.out.println("You are eligible to vote");
        }else {
            System.out.println("You are not eligible to vote");
        }

    }
}
