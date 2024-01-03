package POP.homeworks.answers;

import java.util.Scanner;

public class Answer1 {
    public static void main(String[] args) throws InterruptedException {

        Scanner myscanner = new Scanner(System.in);
        System.out.println("\n *** Uy ishlarini baholash tabeli ***\n");
        boolean toxtasinmi = true;
        while (toxtasinmi){
            System.out.print("Bahoni kiriting:  ");
            int grade = myscanner.nextInt();

           toxtasinmi =  uy_ishlari(grade,toxtasinmi);

        }

    }


    static boolean uy_ishlari(int baho, boolean toxtasinmi) {
        switch (baho) {
            case 0 -> {
                System.out.println("Xayr salomat bo'ling");
                return false;
            }
            case 1 -> System.out.println("Rasvo");
            case 2 -> System.out.println("Juda yomon");
            case 3 -> System.out.println("Qoniqarsiz");
            case 4 -> System.out.println("Qoniqarli");
            case 5 -> System.out.println("A'lo");
            default -> System.out.println("Iltimos siz hech qachon uy yig'ishtirmang");


        }
        return toxtasinmi;
    }

}