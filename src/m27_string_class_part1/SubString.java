package m27_string_class_part1;

@SuppressWarnings("SpellCheckingInspection")
public class SubString {
    public static void main(String[] args) {

        String example = "MuhammadAli Tester";


        // M  u  h  a  m  m  a  d  A  l   i       T   e   s   t   e   r
        // 0  1  2  3  4  5  6  7  8  9  10  11  12  13  14  15  16  17



        /**

         substring() ->  subset of string -> string-ni bo'lagini index bo'yicha olish

         substring() -> kesib olib, yangi string qaytaradi. Eskisi o'chib ketadi.

         */

        System.out.println("substring() example 1:  ->  (Ali)  [ " + example.substring(8, 11) + " ] is subset of MuhammadAli Tester !");

        System.out.println("substring() example 2:  ->  (Test)  [ " + example.substring(12, 16) + " ] is subset of MuhammadAli Tester !");

        System.out.println("substring() example 3:  ->  (Muhammad)  [ " + example.substring(0, 8) + " ] is subset of MuhammadAli Tester !");

        System.out.println("substring() example 4:  ->  (Muhammad Tester)  [ " + example.substring(0,8).concat(example.substring(11)) + " ] is subset of MuhammadAli Tester !");

        System.out.println("substring() example 5:  ->  (Ali Tester Muhammad)  [ " + example.substring(8).concat(" " + example.substring(0, 8)) + " ] is subset of MuhammadAli Tester !");


    }
}
