package Java_Day_013;

public class IphoneController {

    public static void main(String[] args) {

        Iphone iphone = new Iphone("Apple","Pro max","14",1200.0,"Purple");

        System.out.println(iphone);

        iphone.setBrand("");
        System.out.println(iphone.getBrand());

        iphone.setModel("");
        System.out.println(iphone.getModel());




    }
}
