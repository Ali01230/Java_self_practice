package OOP.constructor_encapsulation;

final public class Example1 {
    public static void main(String[] args) {

        Cars bmw = new Cars(1,"White", "Mechanic","bmw",50000);

        Cars toyota = new Cars(2, "black", "automat", "corolla",1000000);


        Cars lacetti = new Cars(1, "srebrno", "automatic", "lacetti combo", 10000);



        bmw.setWeight(3);
        System.out.println(bmw.getWeight());

        bmw.setColor("yellow");
        System.out.println(bmw.getColor());

        bmw.setType("automat");
        System.out.println(bmw.getType());

        bmw.setBrend("BMW");
        System.out.println(bmw.getBrend());

        bmw.setPrice(60000);
        System.out.println(bmw.getPrice());


    }
}
