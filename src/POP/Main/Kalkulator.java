package POP.Main;

import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        Scanner bolish  = new Scanner(System.in);
        System.out.println("KALKULATOR DASTURIGA HUSH KELIBSIZ!!!");
        System.out.println("BOLISH AMALLARINI BAJARAMIZ ");
        System.out.print("BIRINCHI SONNI KIRITING: ");
        int a = bolish .nextInt();
        System.out.print("IKKINCHI SONNI KIRITING: ");
        int b = bolish .nextInt();
        System.out.println("IKKALASINI BOLGANDAGI NATIJASI: -> " + (a / b) + " <- ");


        System.out.println("ENDI ESA KOPAYTIRISH AMALLARIGA NAVBAT");
        Scanner kopaytirish = new Scanner(System.in);
        System.out.print("BIRINCHI SONNI KIRITING: ");
        int c = kopaytirish.nextInt();
        System.out.print("IKKINCHI SONNI KIRITING: ");
        int d = kopaytirish.nextInt();
        System.out.println("IKKALASINI KOPAYTIRGANDAGI NATIJASI: -> " + (c * d) + " <- ");


        System.out.println("ENDI ESA AYRISH AMALLARINI BAJARAMIZ");
        Scanner ayrish = new Scanner(System.in);
        System.out.print("BIRINCHI SONNI KIRITING: ");
        int e = ayrish.nextInt();
        System.out.print("IKKINCHI SONNI KIRITING: ");
        int f = ayrish.nextInt();
        System.out.println("IKKALASINI AYIRGANDAGI NATIJASI : -> " + (e - f) + " <- ");

    }
}
