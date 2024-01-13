package OOP.inheritence;

public class MuhammadaliCars extends OzodbekCars {
    private int weight;
    private String color;
    private String type;
    private String brend;
    private int price;


    @Override
    public String toString() {
        return "MuhammadaliCars{" +
                "weight=" + weight +
                ", color='" + color + '\'' +
                ", type='" + type + '\'' +
                ", brend='" + brend + '\'' +
                ", price=" + price +
                '}';
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrend() {
        return brend;
    }

    public void setBrend(String brend) {
        this.brend = brend;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public MuhammadaliCars(int weight, String color, String type, String brend,
                           int price, String newWheels, int weight1, String color1, String type1, String brend1, int price1) {
        super(weight, color, type, brend, price, newWheels);
        this.weight = weight1;
        this.color = color1;
        this.type = type1;
        this.brend = brend1;
        this.price = price1;
    }

    void brake() {
        System.out.println("Brake is working !!");
    }

    void gas() {
        System.out.println("Gas is also working !!");
    }

    private void bankCarsPassword() {
        System.out.println("1255789");
    }
}
