package Java_Day_013;

public class Iphone {

    private String brand;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (!brand.isEmpty()) {
            this.brand = brand;
        }else {
            System.out.println("Something went wrong becuase you entered null value");
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (!model.isEmpty()){
            this.model = model;
        }else {
            System.out.println("Something went wrong becuase you entered null value");
        }
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (!color.isEmpty()){
            this.color = color;
        }else {
            System.out.println("Something went wrong becuase you entered null value");
        }
    }

    private String model;
    private String size;
    private double price;
    private String color;

    public Iphone(String brand, String model, String size, double price, String color) {
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.price = price;
        this.color = color;
    }

    public void call(String phoneNumber){
        System.out.println("Calling the number" + phoneNumber);
    }
    public void text(String phoneNumber){
        System.out.println("Texting to number" + phoneNumber);
    }
    public void faceTime(String phoneNumber){
        System.out.println("Facetiming with the number" + phoneNumber);
    }

    @Override
    public String toString() {
        return "Iphone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
