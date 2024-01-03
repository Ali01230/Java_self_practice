package POP.while_loop;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userNumber = 0;

        do {
            System.out.println("Eng kamida bir marta ishlaydi");
            userNumber++;
        }
        while (userNumber < 0);

    }
}
