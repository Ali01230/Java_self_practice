package POP.for_loop;

public class Example2 {
    public static void main(String[] args) {


        for (int cameraMan = 1; cameraMan <= 10; cameraMan++){
            if (cameraMan == 5){
                System.out.println(cameraMan);
                continue;
            }
            System.out.println(cameraMan);
        }

    }
}
