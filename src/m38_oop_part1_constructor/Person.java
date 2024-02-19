package m38_oop_part1_constructor;

public class Person {
    public String name;
    public int age;

    public char gender;
    public static boolean isHuman = true,  canBreath = true;

    public static int numberOfHeads ;

    static {

        isHuman =true;
        canBreath = true;
        numberOfHeads = 1;
    }

}
