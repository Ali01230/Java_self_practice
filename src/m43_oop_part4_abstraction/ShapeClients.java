package m43_oop_part4_abstraction;

public class ShapeClients {

    public static void main(String[] args) {


        display(
                new Circle("Aylana", 50)
        );

        display(
                new Rectangle("Aylana",45, 78, 678)
        );



        Shape[] shapes = {
                new Circle("Aylana", 50),
                new Rectangle("Aylana",45, 78, 678),
                new Rectangle("Aylana",45, 78, 678),
                new Circle("Aylana", 50),
                new Circle("Aylana", 50),
        };

        int counter1 = 0;
        int counter2 = 0;

        for (Shape shape: shapes) {
           if (shape instanceof Circle){
               counter1++;
           }

           if (shape instanceof Rectangle){
               counter2++;
           }
        }

        System.out.println(counter1);
        System.out.println(counter2);


        Shape shape1 =  new Circle("Aylana", 50);
        Shape shape2 =  new Rectangle("Aylana",45, 78, 678);




        boolean circleTypeCheck = shape1 instanceof Rectangle;
        boolean rectangleTypeCheck = shape2 instanceof Circle;

        System.out.println(circleTypeCheck);
        System.out.println(rectangleTypeCheck);


    }

    static void display(Shape shape){
        System.out.println("This is : " + shape.age + " and " + shape.name);
    }

    static void circleTypeChecking(Circle circle){
        System.out.println("Yes this is circle, here it is : " + circle);
    }

}



