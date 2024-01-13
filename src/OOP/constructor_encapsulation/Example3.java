package OOP.constructor_encapsulation;

public class Example3 {
    public static void main(String[] args) {


        Fruits apple = new Fruits("apple", "green", 200);

        apple.setName("Apple");
        System.out.println(apple.getName());

        apple.setColor("Black");
        System.out.println(apple.getColor());

        apple.setWeight(300);
        System.out.println(apple.getWeight());



    }
}
