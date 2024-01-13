package OOP.inheritence;

public class Main {
    public static void main(String[] args) {
        MuhammadaliCars mc = new MuhammadaliCars(3,"Black","Automatic","Mustang",
                600000,"yes", 1,"Yellow","Automatic","Honda", 8777700);

        System.out.println(mc.getNewWheels());

        System.out.println(mc.getPrice());
        System.out.println(mc.getColor());
        System.out.println(mc.getBrend());
        System.out.println(mc.getWeight());

    }
}
