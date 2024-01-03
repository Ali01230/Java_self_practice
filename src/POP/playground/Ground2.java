package POP.playground;

@SuppressWarnings("ALL")
public class Ground2 {

    public static void main(String[] args) {

        //VOID
        name("MUHAMMADALI");


        //RETURN TYPE
        System.out.println(printName("RETURN TYPE: " + "muhammadali"));

        //RETURN TYPE
        System.out.println("RETURN TYPE DOUBLE: " + squareDouble(5.8));

        //RETURN TYPE
        System.out.println("RETURN TYPE STRING: " + concatNames("Ozodbek", "Karimov"));


        //VOID
        calculator1(5.6f,5.8f);


        //RETURN TYPE
        System.out.println("RETURN TYPE CALCULATOR: -> " + calculator2(5.5f,7.7f));

        //RETURN TYPE WITH METHOD OVERLOADING
        System.out.println("RETURN TYPE CALCULATOR: -> " + calculator2(5.5f));


        System.out.println("Return type calculator: ->" + calculator3(3.4d, 5.4d));


        //VOID
        String[] name = {"Ozodbek","Ozodbek","Ozodbek","Ozodbek","Ozodbek","Ozodbek"};
//        loopThroughNames(name);


        //VOID
        int[] numbers = {30,34,67,23,10,4,7,8,45};
        loopThroughNumbers(numbers);


    }

    static int calculator3(double v, double v1) {

    int result = (int) (v + v1);

    return result;
    }

    static void loopThroughNumbers(int[] numbers){

        for (int cameraMan = 0; cameraMan < numbers.length; cameraMan++){
            System.out.println((cameraMan + 1) + " -> " + (numbers[cameraMan] + numbers[cameraMan]));
        }

    }



    // 1 - turi
    // VOID - hech narsa qaytarmaydi
    // lekin parametr qabul qiladi
    static void name(String name){

        String result = name.toLowerCase();

        System.out.println("VOID: " + result);
    }


    // 2 - turi
    // Return type - qiymat qabul qilib , u bilan qandaydir vazifa
    // bajarib so'ng uni qaytarib yuboradi
    static String printName(String name){

        String result = name.toUpperCase();

        return result;
    }

    static String squareDouble(Double value){

        double result = Math.sqrt(value);

        return String.format("%.3f", result);
    }

    static String concatNames(String name, String surename){

        String result = name.concat(" " + surename);

        return result;
    }

    static void loopThroughNames(String[] names){
        for (int cameraMan = 1; cameraMan < names.length; cameraMan++){
            System.out.println(cameraMan + " -> " + names[cameraMan]);
        }
    }

    static void calculator1(float num1, float num2){

        int result = (int) (num1 + num2);

        System.out.println("VOID CALCULATOR: -> " + result);
    }

    static int calculator2(float num1, float num2){

        int result = (int) (num1 + num2);

        return result;
    }

    static int calculator2(float num2){
        int result = (int) (5 + num2);

        return result;
    }


}
















