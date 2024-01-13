package OOP.constructor_encapsulation;

public class Fruits {
    private String name;
    private String color;
    private int weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }


    Fruits(String name, String color, int weight) {
        this.name = name;
        this.color = color;
        this.weight = weight;
    }


}

