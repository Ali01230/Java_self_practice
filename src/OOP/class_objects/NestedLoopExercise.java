package OOP.class_objects;

public class NestedLoopExercise {

    public static void main(String[] args) {
        for (int i=1; i<=5; i++){

            System.out.println("Lap "+i+ " is finished.");

            for (int j=1; j>=3; j++){

                System.out.println("..........Push-up "+j+" is done");
            }
        }
    }
}
