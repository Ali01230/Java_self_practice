package dastur_uz;

import java.util.Scanner;

public class Begin2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Yuza uchun son kiriting: ");
        int aNumber = sc.nextInt();
        System.out.println("Berilgan sonning yuzasi = " + yuzaCal(aNumber));

    }

    static int yuzaCal(int a){
        int S = a * a;
        return S;
    }
}
