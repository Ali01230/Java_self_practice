package POP.methods;

public class Example1 {
    public static void main(String[] args) {

        System.out.println(calculator(12, 45));

        System.out.println(calculator(5,5));

        System.out.println(calculator(7,2));

        Example3.printArraoyOfGenders();

    }

    public static int calculator(int a, int b){
        return a + b;
    }

    public static int myGlobalVariable = 45;

    static void separateGender(String[] fname, int[] ages){
        for (String cameraMan : fname) {
            for (int cameraMan2: ages){
                if (cameraMan.endsWith("oy") || cameraMan.endsWith("xon")) {
                    System.out.println(cameraMan.toUpperCase().concat(" Makhmudova [AYOL]".concat("yoshi:").concat(String.valueOf(cameraMan2))).trim());
                } else {
                    System.out.println(cameraMan.toUpperCase().concat(" Makhmudov [ERKAK]".concat("yoshi:").concat(String.valueOf(cameraMan2))).trim());
                }
            }
        }
    }




}


