package POP.Main;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //JDK->Kutubxonalar Jamlanmasi
        // scanner-> kitob
        System.out.println("KALKULATOR DASTURIGA XUSH KELIBSIZ !!! ");
        System.out.print("BIRINCHI SONNI KIRITING:  ");
        int a = sc.nextInt();
        System.out.print("IKKINCHI SONNI KIRITING:  ");
        int b = sc.nextInt();
        System.out.print("IKKALASINI QO'SHGANDA NATIJA: -> " + (a + b) + " <- ");
    }
}
