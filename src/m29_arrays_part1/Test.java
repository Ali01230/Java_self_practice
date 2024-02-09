package m29_arrays_part1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first word:");
        String firstWord = input.nextLine().trim().toLowerCase();

        System.out.print("Enter the second word:");
        String secondWord = input.nextLine().trim().toLowerCase();

        StringBuilder builder = new StringBuilder();

        if (firstWord.charAt(firstWord.length() - 1) == secondWord.charAt(0)) {
            builder.append(firstWord).append(secondWord);
        }else{
            builder.append(firstWord).append("\n").append(secondWord);
        }

        System.out.println(builder);
    }
}

