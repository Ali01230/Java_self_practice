package m27_string_class_part1;

public class StringIntro {

    public static void main(String[] args) {

        String s1 = "Wooden spoon";
        String s2 = "Wooden spoon";

        System.out.println( s1 == s2 );


        String s3 = new String("Wooden spoon");  //  new object
        String s4 = new String("Wooden spoon");

        System.out.println(s3 == s4);
    }
}
