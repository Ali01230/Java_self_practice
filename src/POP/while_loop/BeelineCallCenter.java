package POP.while_loop;

import java.util.Scanner;

public class BeelineCallCenter {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


        System.out.println("Beeline-ga xush kelibsiz...");

       while (true){
           System.out.print("Yangi tarif turini kiriting: ");
           String tarif = sc.nextLine().trim();

           System.out.print("TOP UP uchun qiymatini kiriting: ");
           String topUp = sc.nextLine().trim();

           System.out.println("Yangi tarif turi: " + tarif);
           System.out.println("TOP UP qilingan balance: " + topUp);
       }

    }
}
