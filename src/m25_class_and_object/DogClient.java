package m25_class_and_object;

public class DogClient {

    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.name = "Debbie";
        dog1.breed = "Husky";
        dog1.age = 2;
        dog1.color = "Brown";

        System.out.println("Name: " + dog1.name);
        System.out.println("Breed: " + dog1.breed);
        System.out.println("Age: " + dog1.age);
        System.out.println("Color: " + dog1.color);
        dog1.bark();
        dog1.eat();
        dog1.sleep();

        System.out.println(dog1);


        Dog dog2 = new Dog();
        dog2.name = "Lessy";
        dog2.age = 3;
        dog2.color = "Red";
        dog2.breed = "Alabay";
        System.out.println(dog2);

        Dog dog3 = new Dog();
        dog3.name = "Bobby";
        dog3.color = "Black";
        dog3.breed = "Bulldog";
        dog3.age = 5;
        System.out.println(dog3);

    }
}
