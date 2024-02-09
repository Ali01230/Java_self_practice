package m27_string_class_part1;

public class IndexOfAndLastIndexOf {
    public static void main(String[] args) {

        String str = "Cydeo deo";

        // C  y  d  e  o     d  e  o
        // 0  1  2  3  4  5  6  7  8

        System.out.println("indexOf() example 1:  ->  d(2) is in  [ " + str.indexOf("d") + " ] index of Cydeo !");

        System.out.println("indexOf() example 2:  ->  d(6) is in  [ " + str.indexOf("d", 5) + " ] index of Cydeo !");

        System.out.println("lastIndexOf() example 1:  ->  o is in  [ " + str.lastIndexOf("o") + " ] last index of Cydeo !");

        System.out.println("lastIndexOf() example 2:  ->  o is in  [ " + str.lastIndexOf("o", 5) + " ] last index of Cydeo !");

    }
}
