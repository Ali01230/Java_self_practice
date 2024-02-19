package m43_oop_part4_abstraction;

public class Circle extends Shape{

    public double radius;

    public Circle(String name, int age) {
        super(name, age);
    }


    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", area='" + calculate_area() +
                '}';
    }

    @Override
    public double calculate_area(){
        return radius * radius * Math.PI;
    }

    @Override
    public void thisIsNormalMethod() {
        super.thisIsNormalMethod();
    }

    public static void main(String[] args) {

        Circle circle = new Circle("Men", 23);
        System.out.println(circle);

        circle.thisIsNormalMethod();

    }


}
