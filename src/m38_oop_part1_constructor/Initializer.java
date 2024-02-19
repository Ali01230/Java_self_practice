package m38_oop_part1_constructor;

public class Initializer {

    public String initialized;

    {
        initialized = "First value";
        System.out.println("Before constructor works 1 ! " + initialized);
    }

    {
        initialized = "Second value";
        System.out.println("Before constructor works 2 ! " + initialized);    }

    {
        initialized = "Third value";
        System.out.println("Before constructor works 3 ! " + initialized);
    }

    public Initializer(String initialized){
        this.initialized = initialized;
    }


}
