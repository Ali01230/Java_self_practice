package POP.Main;

import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        byte a = 123; //1 byte

        short b = 453; //2 bytes

        int c = 10000;  //4 bytes

        long d = 453453; //8 bytes

        float e = 10000f; // 4 bytes

        double f = 10000d; // 8 bytes

        boolean h = true; //1 bit

        char t = '4';  //2 bytes

        System.out.print("1 SON KIRITING: ");
        double aSon = myScanner.nextInt();
        System.out.print("2 SON KIRITING: ");
        double bSon = myScanner.nextDouble();

        System.out.print("Natija: " + (aSon + bSon) + " bo'ladi");



    }
}
