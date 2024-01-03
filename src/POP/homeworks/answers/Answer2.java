package POP.homeworks.answers;

import java.util.Scanner;

public class Answer2 {
    public static void main(String[] args) throws InterruptedException {

        Scanner myscanner = new Scanner(System.in);
        System.out.println("\n *** Uy ishlarini baholash tabeli ***\n");
        boolean toxtasinmi = true;
        while (toxtasinmi) {
            System.out.print("Bahoni kiriting:  ");
            int grade = myscanner.nextInt();

            toxtasinmi = uy_ishlari(grade, toxtasinmi);

        }

    }


    static boolean uy_ishlari(int baho, boolean toxtasinmi) {

        if (baho == 0) {
            System.out.println("Xayr salomat bo'ling");
            return false;

        } else if (baho == 1) {
            System.out.println("Rasvo");

        } else if (baho == 2) {
            System.out.println("Juda yomon");

        } else if (baho == 3) {
            System.out.println("Qoniqarsiz");

        } else if (baho == 4) {
            System.out.println("Qoniqarli");

        } else if (baho == 5) {
            System.out.println("A'lo");

        } else {
            System.out.println("Iltimos siz hech qachon uy yig'ishtirmang");

        }

        return toxtasinmi;
    }

}