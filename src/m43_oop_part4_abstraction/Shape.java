package m43_oop_part4_abstraction;

public abstract class Shape {

    protected String name;
    protected int age;

    Shape(String name, int age){
        this.name = name;
        this.age = age;
    }

      abstract double calculate_area();

    public void thisIsNormalMethod(){
        System.out.println("This is normal meth od");
        System.out.println(name + " " + age);
    }

    @Override
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
