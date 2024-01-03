package dastur_uz;

import java.util.Scanner;

public class Begin1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Perimetr uchun son kiriting: ");
        int aNumber = sc.nextInt();
        System.out.println("Berilgan sonning perimetri = " + perimetrCal(aNumber));

    }

    static int perimetrCal(int a){
        int P = a * 4;
        return P;
    }
}
