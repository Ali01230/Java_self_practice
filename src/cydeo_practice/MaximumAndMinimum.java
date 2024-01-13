package cydeo_practice;

public class MaximumAndMinimum {
    public static void main(String[] args) {
        System.out.println(max(5, 9));
        System.out.println(max(1.1, 4.4));
        System.out.println(min(4, 7));
        System.out.println(min(4.4, 7.7));

    }

    static int max(int aInteger, int bInteger){

        if (aInteger > bInteger){
            return aInteger;
        }

        return bInteger;

    }
    static double max(double a, double b){

        if (a > b){
            return a;
        }
       return b;
    }

    static int min(int a, int b){
         if(a < b){
             return a;
         }
         return b;
    }

    static double min(double a, double b) {
        if (a < b) {
            return a;
        }
        return b;
    }


}
