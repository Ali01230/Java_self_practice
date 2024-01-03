package OOP.constructor;

public class Drinks {
    private String name;
    private String information;
    private int weight;
    private String factory;
    private String brand;
    private String date;

    public Drinks(String name, String information, int weight, String factory, String brand, String date) {
        this.name = name;
        this.information = information;
        this.weight = weight;
        this.factory = factory;
        this.brand = brand;
        this.date = date;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getFactory() {
        return factory;
    }

    public void setFactory(String factory) {
        this.factory = factory;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
