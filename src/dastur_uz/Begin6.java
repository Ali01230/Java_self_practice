package dastur_uz;

import java.util.Scanner;

public class Begin6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Paralelepepidning tomonlari uchun a sonni kiriting: ");
        int aNumber = sc.nextInt();
        System.out.print("Paralelepepidning tomonlari uchun b sonni kiriting: ");
        int bNumber = sc.nextInt();
        System.out.print("Paralelepepidning tomonlari uchun c sonni kiriting: ");
        int cNumber = sc.nextInt();

        System.out.println("Berilgan sonning hajmi = " + hajmiCal(aNumber,bNumber,cNumber));
        System.out.println("Berilgan sonning sirti = " + sirtiCal(aNumber,bNumber,cNumber));

    }

    static int hajmiCal(int a, int b,int c){
        int V = a * b * c;
        return V;
    }

    static int sirtiCal(int a, int b,int c){
        int S = 2 * (a * b + b * c + a * c);
        return S;
    }
}
