package OOP.class_objects;

import Practices.encapsulation.QAtester;

public class CarSpeed extends QAtester {

    int gas;
    String model;

    public CarSpeed(int experiance, String country, String workplace, String programmingLanguage, double salary, int gas, String model) {
        super(experiance, country, workplace, programmingLanguage, salary);
        this.gas = gas;
        this.model = model;
    }

    @Override
    public String toString() {
        return "CarSpeed{" +
                "gas=" + gas +
                ", model='" + model + '\'' +
                '}';
    }


    void Test(int gas){
        this.gas = gas;
    }
}
