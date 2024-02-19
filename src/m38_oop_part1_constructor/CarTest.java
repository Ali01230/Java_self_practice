package m38_oop_part1_constructor;

public class CarTest {
    public static void main(String[] args) {

        Car nexia = new Car("Nexia", 2023, 30000);

        System.out.println(nexia.model);
        System.out.println(nexia.year);
        System.out.println(nexia.price);

    }
}
