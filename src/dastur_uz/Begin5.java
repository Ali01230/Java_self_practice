package dastur_uz;

import java.util.Scanner;

public class Begin5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Kubni yon tomoni uchun a son kiriting: ");
        int aNumber = sc.nextInt();
        System.out.println("Berilgan sonning hajmi = " + hajmCal(aNumber));
        System.out.println("Berilgan sonning sirti = " + sirtiCal(aNumber));

    }

    static int hajmCal(int a){
        int V = a * a * a;
        return V;
    }
    static int sirtiCal(int a) {
        int S = 6 * (a * a);
        return S;
    }
}
