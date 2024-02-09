package m27_string_class_part1;

public class EqualsVsEqualsIgnoreCase {

    public static void main(String[] args) {

        // equals() -> method in Java

        String example1 = "Muhammadali";
        String example2 = "MuhammadAli";


        System.out.println("Equals example result: -> equals()  [ " + example1.equals(example2) + " ] ");

        System.out.println("EqualsIgnoreCase example result: -> equalsIgnoreCase()  [ " + example1.equalsIgnoreCase(example2) + " ] ");


        // ---------------------------------------------


        // ==  ->  operator in Java (equal to)

        String example3 = "MuhammadAli";
        String example4 = "MuhammadAli";

        System.out.println("Equal to example result: -> ==  [ " + (example1 == example2) + " ] ");
    }
}
