package m25_class_and_object;

public class Car {

    public String make, model;
    public int year;
    public String color;
    public double price;

    public void start(){
        System.out.println(make + " " + model + " is starting");
    }

    public void drive(){
        System.out.println(make + " " + model + " is driving");
    }
    public void stop(){
        System.out.println(make + " " + model + " is driving");
    }
    public void showCurrentSpeed(int currentSpeed, int speedLimit){
        if(currentSpeed <= speedLimit){
            System.out.println(make + " is driving at" + currentSpeed + ", following the speed limit" + speedLimit);
        }else {
            System.out.println(make + " is driving at" + currentSpeed + ", over the speed limit" + speedLimit);
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
