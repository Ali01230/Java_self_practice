package m29_arrays_part1;

import java.util.Arrays;

public class ArrayPractice2 {

    static int collector = 0;
    public static void main(String[] args) {
        String[] deliveries = new String[11];

        for (int i = 0; i < deliveries.length; i++){
            deliveries[i] = "Donbrowskiego " + (i + 1);
        }

        Arrays.fill(deliveries, "Donbrowskiego");

//        deliveries[deliveries.length -1] = "Madalinskiego 21";
//
//        deliveries[deliveries.length/2] = "Bruno 9";

        System.out.println(Arrays.toString(deliveries));



        int[] payouts = {425, 452, 437, 412, 249, 284, 243};


        for (int payout : payouts) {
            System.out.println(payout + " zl");
            collector += payout;
        }
        System.out.println("Overall 1 week payout is : " + collector);


        System.out.println("-----------------------------");
        for (int i = payouts.length - 1; i >= 0; i--) {
            System.out.println(payouts[i]);
        }





    }
}
