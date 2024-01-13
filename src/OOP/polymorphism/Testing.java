package OOP.polymorphism;

import java.util.Scanner;

public class Testing {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ikkita son kiriting");
        System.out.println("1-");
        int first = scanner.nextInt();
        System.out.print("2-");
        int second = scanner.nextInt();

        System.out.println("Natija: " + cal(first, second));


    }

    static int cal(int a, int b) {
        return a + b;


    }
}