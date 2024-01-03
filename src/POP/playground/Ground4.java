package POP.playground;



public class Ground4 {


    static {
        int a = 10;
        System.out.println(a);
    }

    public static void main(String[] args) {


        //SCOPE

        {
            int a = 10;
            System.out.println(a);
        }


        for (int cameraMan = 1; cameraMan < 10; cameraMan++) {
            System.out.println(cameraMan);
        }

        int v = 7;

        if (v > 8){
            int result = 5;
        }




    }
}
