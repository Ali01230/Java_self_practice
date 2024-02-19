package m43_oop_part4_abstraction;

public class Rectangle extends Shape {

    public double width, length;


    public Rectangle(String name, int age, double width, double length) {
        super(name, age);
        this.width = width;
        this.length = length;
    }

    @Override
    public double calculate_area() {
        return width * length;

    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", area=" + calculate_area() +
                '}';
    }


}
