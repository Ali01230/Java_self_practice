package dastur_uz;

import java.util.Scanner;

public class Begin4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Aylanani diametri uchun d son kiriting: ");
        int dNumber = sc.nextInt();
        System.out.println("Berilgan sonning diametri = " + diametrCal(dNumber));

    }

    static int diametrCal(int d){
        int L = (int) Math.PI * d;
        return L;
    }
}
