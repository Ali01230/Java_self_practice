package m38_oop_part1_constructor;

public class Car {
    public String model;
    public int year;
    public int price;




    public Car(){
        System.out.println("NO PARAMETR CONSTRUCTOR STARTS !");
    }

    public Car(String model){
        this();
        this.model = model;
    }

    public Car(String model, int year){
        this(model);
        this.year = year;
    }

    public Car(String model, int year, int price){
        this(model, year);
        this.price = price;
    }


}
