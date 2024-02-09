package m17_loops_part2;

public class ForLoopRuless {
    public static void main(String[] args) {

        // 1.Avoid infinite loops:
        /***
        for (;;){
            System.out.println("Cydeo");
        }

         */
/***
        for (int i = 0; i > -1 ; i++) {

        }***/
// 2.Multiple veriables of same type can be given in initialization

        for (int i = 1, j = 10, k = 100; i < 11; i++, j += 10, k += 100) {
            System.out.println(i + " == " + j + " == " + k);

        }
        System.out.println("------------------------------------------------");
        
        //3 re-assigning a variable in the for loop block
        
        int x;
        for ( x = 0; x < 5; x++) {
            System.out.println(x);
            
        }
        System.out.println("-----------------------------------------");


        //4. loop variable can not be used outside the fot loop's body

        for (int i = 10; i < 1; i += 20){
            System.out.println(i);


        }

    }

}
