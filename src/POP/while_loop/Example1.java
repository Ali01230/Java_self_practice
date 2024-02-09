package POP.while_loop;

public class Example1 {
    public static void main(String[] args) {


        int cameraMan1 = 0; // 5
        while (cameraMan1 < 5){
            System.out.println(" While loop : ->  " + cameraMan1 + " CameraMan-ning ro'yxatida");
            cameraMan1++;


            // cameraMan1 = 0
            // 1 loop ->  true -> p : 0  ->  cameraMan1 = 1
            // 2 loop ->  true -> p : 1  ->  cameraMan1 = 2
            // 3 loop ->  true -> p : 2  ->  cameraMan1 = 3
            // 4 loop ->  true -> p : 3  ->  cameraMan1 = 4
            // 5 loop ->  true -> p : 4  ->  cameraMan1 = 5
            // 6 loop ->  false -> loop break;
        }


        System.out.println("-----------------------------------------");


        for (int cameraMan2 = 0; cameraMan2 < 5; cameraMan2++){
            System.out.println(" For loop : -> " + cameraMan2 +  " CameraMan-ning ro'yxatida");

            // cameraMan = 0
            // 1 loop ->  true -> 0  ->  cameraMan = 1
            // 2 loop ->  true -> 1  ->  cameraMan = 2
            // 3 loop ->  true -> 2  ->  cameraMan = 3
            // 4 loop ->  true -> 3  ->  cameraMan = 4
            // 5 loop ->  true -> 4  ->  cameraMan = 5
            // 6 loop ->  false -> loop break;

        }

        System.out.println("----------------------------------------");

//        for (int i = 0; i < 20; i++){
//            i+=1;
//            System.out.println(i);
//            i*=2;
//            i-=2;
//
//            // 1 2 4  8  16
//
//            // i = 0
//            // 1 loop ->  true -> 0  ->  (in 1)  i = 2
//            // 2 loop ->  true -> 2  ->  (in 3)  i = 4
//            // 3 loop ->  true -> 4  ->  (in 5)  i = 6
//            // 4 loop ->  true -> 6  ->  (in 7)  i = 8
//            // 5 loop ->  true -> 8  ->  (in 9)  i = 10
//            // 6 loop ->  false -> break;
//        }




        //DIFFERENCE

        // qachonki sizga chegarasi aniq bomagan aylanish (loop) kerak bo'lsa while() loop ishlating

        // qachonki chegarasi aniq bolgan aylanis (loop) kerak bo'lsa for() loop ishlating



    }
}
