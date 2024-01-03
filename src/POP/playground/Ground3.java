package POP.playground;

public class Ground3 {
    public static void main(String[] args) {


        //METHOD OVERLOADING

        String myNum1 = plusMethod(8, 5);
        String myNum2 = plusMethod(4.3, 6.26);
        System.out.println("int: " + myNum1);
        System.out.println("double: " + myNum2);

    }

    static String plusMethod(int x, int y) {
        return String.valueOf((x + y));
    }

    static String plusMethod(double x, double y) {
        return String.format("%.2f",(x  + y));
    }
}
