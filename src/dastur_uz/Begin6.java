package dastur_uz;

import java.util.Scanner;

public class Begin3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("To'rtburchak tomonlari uchun a sonni kiriting: ");
        int aNumber = sc.nextInt();
        System.out.print("To'rtburchak tomonlari uchun b sonni kiriting: ");
        int bNumber = sc.nextInt();

        System.out.println("Berilgan sonning yuzasi = " + yuzaCal(aNumber,bNumber));
        System.out.println("Berilgan sonning perimetri = " + perimetrCal(aNumber,bNumber));

    }

    static int yuzaCal(int a, int b){
        int S = a * b;
        return S;
    }

    static int perimetrCal(int a, int b){
        int P = 2 * (a + b);
        return P;
    }
}
