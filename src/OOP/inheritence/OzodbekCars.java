package OOP.inheritence;

public class OzodbekCars {
    private int weight;
    private String color;
    private String type;
    private String brend;
    private int price;
    protected String newWheels;


    @Override
    public String toString() {
        return "OzodbekCars{" +
                "weight=" + weight +
                ", color='" + color + '\'' +
                ", type='" + type + '\'' +
                ", brend='" + brend + '\'' +
                ", price=" + price +
                ", newWheels='" + newWheels + '\'' +
                '}';
    }

    public String getNewWheels() {
        return newWheels;
    }

    public void setNewWheels(String newWheels) {
        this.newWheels = newWheels;
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

    public OzodbekCars(int weight, String color, String type, String brend, int price, String newWheels) {
        this.weight = weight;
        this.color = color;
        this.type = type;
        this.brend = brend;
        this.price = price;
        this.newWheels = newWheels;
    }

    void brake(){
        System.out.println("Brake is working !!");
    }

    void gas(){
        System.out.println("Gas is also working !!");
    }

    private void bankCarsPassword(){
        System.out.println("1255789");
    }
}
