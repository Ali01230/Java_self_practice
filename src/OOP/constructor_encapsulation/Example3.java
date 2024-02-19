package OOP.constructor_encapsulation;

public class Example3 {
    public static void main(String[] args) {


        Fruits apple = new Fruits("apple", "green", 200);


        apple.setName("Apple bang!!!");
        System.out.println(apple.getName().toUpperCase());

        apple.setColor("White");
        System.out.println(apple.getColor());

        apple.setWeight(10000);
        System.out.println(apple.getWeight());


    }
}
