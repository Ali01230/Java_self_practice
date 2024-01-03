package POP.arrays;

public class Example1 {
    public static void main(String[] args) {

        String[] names = {"Ozodbek", "Azizbek","Muhammadali", "Ali", "Karim","Usmonxoja"};


        // 0 1 2 3 4 5
        // 0 1 2 3 4 5 6
        for (int cameraMan = 0; cameraMan < names.length; cameraMan++){
            System.out.println( names[cameraMan] );
        }

        for (String cameraMan : names) {
            System.out.println(cameraMan);
        }

    }
}
