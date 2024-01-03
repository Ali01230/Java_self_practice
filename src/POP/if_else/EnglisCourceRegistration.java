package POP.if_else;

import java.util.Scanner;

public class EnglisCourceRegistration {
    public static void main(String[] args) throws InterruptedException {


//        System.out.println("Ro'yxatdan o'tish uchun yoshingizni kiriting !!");
//        System.out.print("Yoshingiz: ");
//        int age = myScanner.nextInt();
//        courseRegistration(age);

//        Scanner myScanner = new Scanner(System.in);
//        boolean toxtasinmi = true;
//
//        while (toxtasinmi){
//            System.out.print("Oy raqamini kiriting:");
//            int month = myScanner.nextInt();
//            monthSelector(month);
//
//            System.out.println("To'xtatish uchun 0 ni kiriting");
//            toxtasinmi = (month != 0);
//        }

        Scanner mySanner  = new Scanner(System.in);
        System.out.println("\n✮✮✮✮ Faslni bilish ilovasiga xush kelibsiz ✮✮✮✮\n");

        boolean toxtasinmi = true;
        while (toxtasinmi){
            Thread.sleep(3000);
            System.out.println("Faslni bilish uchun oy raqamini kiriting: ");
            System.out.print("Oy raqami: ");

            int season = mySanner.nextInt();
            seasonSelector(season);

            if (season == 0){
                toxtasinmi = false;
            }else{
                toxtasinmi = true;
                System.out.println(" ⤫⤫ To'xtatish uchun 0-ni kiriting ⤫⤫ ");
            }
        }



    }

    static void courseRegistration(int age) {
        switch (age) {
            case 1,2,3,4,5,6,7 -> System.out.println("Siz Starter kursga qabul qilinasiz");
            case 8, 9 -> System.out.println("Siz Beginner kursga qabul qilinasiz");
            case 10, 11 -> System.out.println("Siz Elementary kursga qabul qilinasiz");
            case 12, 13 -> System.out.println("Siz Pre-Intermediate kursga qabul qilinasiz");
            case 14, 15 -> System.out.println("Siz Intermediate kursga qabul qilinasiz");
            case 16, 17 -> System.out.println("Siz Advanced kursga qabul qilinasiz");
            case 18,19,20,21,22,23,24 -> System.out.println("Siz Advanced kursga qabul qilinasiz");
            default -> System.out.println("Siz Bizga to'g'ri kemadiz");
        }
    }

    static void monthSelector(int month){
        switch (month){
            case 1 -> System.out.println("Yanvar");
            case 2 -> System.out.println("Fevral");
            case 3 -> System.out.println("Mart");
            case 4 -> System.out.println("Aprel");
            case 5 -> System.out.println("May");
            case 6 -> System.out.println("Iyun");
            case 7 -> System.out.println("Iyul");
            case 8 -> System.out.println("Avgust");
            case 9 -> System.out.println("Sentabr");
            case 10 -> System.out.println("Oktabr");
            case 11 -> System.out.println("Noyabr");
            case 12 -> System.out.println("Dekabr");
            default -> System.out.println("Bunday oy mavjud emas");
        }
    }

    static void seasonSelector(int season){
        switch (season){
            case 0 -> System.out.println(" ♡♡♡ Ilovamizdan foydalanganingiz uchun rahmat, Salomat bo'ling ♡♡♡ ");
            case 3,4,5 -> System.out.println("Siz kiritgan oy raqami: " + season + "   ❀ Bahor faslida");
            case 6,7,8 -> System.out.println("Siz kiritgan oy raqami: " + season + "   ☼ Yoz faslida");
            case 9,10,11 -> System.out.println("Siz kiritgan oy raqami: " + season + "   ☁ Kuz faslida");
            case 12,1,2 -> System.out.println("Siz kiritgan oy raqami: " + season + "   ❄ Qish faslida");
            default -> System.out.println("❤ Bunday fasl mavjud emas ❤");
        }
    }
}

