package OOP.class_objects;

public class GroundMain {

    int result;

    public GroundMain(int exampleNumber1, int exampleNumber2){

        int overall = exampleNumber1 + exampleNumber2;

        result  = overall;
    }

    public static void main(String[] args) {

        GroundMain myObject = new GroundMain(45,45);

        System.out.println(myObject.result);

    }
}
