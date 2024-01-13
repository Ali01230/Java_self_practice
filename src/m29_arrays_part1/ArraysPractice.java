package m29_arrays_part1;

import java.util.Arrays;

@SuppressWarnings("SpellCheckingInspection")
public class ArraysPractice {
    public static void main(String[] args) {


        // Array  ->  massiv, bir qator bir xil elementlar

        int studentId1 = 69010;
        int studentId2 = 69010;
        int studentId3 = 69010;
        int studentId4 = 69010;
        int studentId5 = 69010;
        int studentId6 = 69010;
        int studentId7 = 69010;
        int studentId8 = 69010;
        int studentId9 = 69010;
        int studentId10 = 69010;

        int[] students = {67010, 76010, 32010, 23010, 13010, 11010, 13210, 87010, 77010, 44010};

        //                 0       1      2     3      4      5       6      7      8      9


        System.out.println(students[3]);
        System.out.println(students[students.length - 1]);

        System.out.println("Unchanged:  -> " + students[0]);

        students[0] = 12345;

        System.out.println("Changed:  -> " + students[0]);


        // for each loop
//        for(int index : students){
//            System.out.println(index);
//        }

        for (int index = 0; index < students.length; index++){
            System.out.println(index + 1 + " : -> " + students[index]);
        }



        String[] girls = new String[10];


        girls[0] = "Ra'no";

        girls[9] = "Barchinoy";

        girls[0] = "Ra'noxon";

        System.out.println(Arrays.toString(girls));

        String[] boys = new String[34];

        boys[boys.length/2+1] = "Bahodir";

        System.out.println(Arrays.toString(boys));




        String[] deliveries = new String[11];

        for (int i = 0; i < deliveries.length; i++){
            deliveries[i] = deliveries[i];
            System.out.println(Arrays.toString(deliveries));
        }


    }
}
