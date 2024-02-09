package m27_string_class_part1;

import java.util.Scanner;

@SuppressWarnings("SpellCheckingInspection")
public class Replace {
    public static void main(String[] args) {


        String example = "MuhammadAli Tester";


        // M  u  h  a  m  m  a  d  A  l   i       T   e   s   t   e   r
        // 0  1  2  3  4  5  6  7  8  9  10  11  12  13  14  15  16  17


//        example.replace();
//        example.replaceFirst();
//        example.replaceAll();


        // replace()

        example = example.replace("MuhammadAli", "Ozodbek");

        System.out.println(example);

        System.out.println(example.replace('A', 'a')); // using char

        System.out.println(example.replace("Tester", "Testerchi")); // using String or CharSequence


//        // replaceFirst()
        System.out.println(example.replaceFirst("Ozodbek", "MuhammadAli"));


//        // replaceAll()

        System.out.println(example.replaceAll("Ozodbek", "MuhammadAli"));


        // trim()

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your firstName: ");
        String firstName = sc.nextLine().trim().toLowerCase();

        System.out.print("Enter your email: ");
        String email = sc.nextLine().trim().toUpperCase();

        System.out.println("Result: -> " + firstName + " " + email);


        // PRACTICE

        System.out.println("replace() example 1:  ->  (MuhammadAlijon Tester)  [ " + example.replace("MuhammadAli","MuhammadAlijon") + " ] is replacement of MuhammadAli Tester !");

        System.out.println("replace() example 2:  ->  (MuhammadAli QA Tester)  [ " + example.replace("MuhammadAli","MuhammadAli QA") + " ] is replacement of MuhammadAli Tester !");

        System.out.println("replace() example 3:  ->  (Muhammad Tester)  [ " + example.replace("MuhammadAli","Muhammad") + " ] is replacement of MuhammadAli Tester !");

        System.out.println("replace() example 4:  ->  (Muhammadali tester)  [ " + example.replace("MuhammadAli","Muhammadali") + " ] is replacement of MuhammadAli Tester !");

        System.out.println("replace() example 5:  ->  (Ali Tester)  [ " + example.replace("MuhammadAli","Ali") + " ] is replacement of MuhammadAli Tester !");


    }
}
