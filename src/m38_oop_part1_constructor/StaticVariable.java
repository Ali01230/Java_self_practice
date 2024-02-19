package m38_oop_part1_constructor;

public class StaticVariable {
    public int age = 5;
    static int price = 5;

    public  StaticVariable(){
        System.out.println(age);
    }

    public static void main(String[] args) {
        int a = 7;

        {
            int b = 7;
        }
    }

}
