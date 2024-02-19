package m38_oop_part1_constructor;

public class InitializerBlock {


    public static void main(String[] args) {


        Initializer init1 = new Initializer("Started");
        Initializer init2 = new Initializer("Ended");
        System.out.println(init1.initialized);
        System.out.println(init2.initialized);
    }
}
