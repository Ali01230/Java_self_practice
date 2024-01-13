package POP.playground;

public class Ground1 {
    public static void main(String[] args) {

//        String name1 = "odil";
//        String  name2  = "Komil";
//        name1 = "sarvar";
//        System.out.println(name1);
//
//        int coffee = 10000; //  newCoffee = 15.500
//        double sugar = 13.500;  //  newSugar  = 14000
//
//        double newCoffe = coffee;
//        int newSugar = (int) sugar;
//
//        newCoffe = 15.500d;
//        newSugar = 14000;
//
//        System.out.printf("%.3f%n", newCoffe);
//        System.out.println(newSugar);
//
//

//        int result = a + b / b * b - b;
//        System.out.println(result);

//        int newA = --a;
//        int newB = ++b;
//
//        System.out.println(newA);
//        System.out.println(newB);

//        int newA = a-=10;
//        int newB = b+=4;
//
//        System.out.println(newA);
//        System.out.println(newB);


//        System.out.println(name.toUpperCase());
//        System.out.println(name.toLowerCase());
//        System.out.println(name1.concat(name2));
//        int r = coffee + coffee;
//        System.out.println(name1 + r);
//        String name = "MuhammadAli";
//        System.out.println(name);

//        int a = 47;
//        int b = 23;
//
//        System.out.println("shu son katta: " + (Math.max(a, b)));
//        System.out.println("shu son kichkina : " + (Math.min(a, b)));
//
//        Random rd = new Random();
//        int natija = (rd.nextInt(10));
//
//        System.out.println("1: yo'li: " + natija);
//
//        int natija2 = (int) (Math.random() * 10);
//        System.out.println("2: yo'li: " + natija2);


        boolean ozgardimi = false;
        int milk = 10000;

        milk = 15000;
        ozgardimi = true;

        milk = 10000;
        ozgardimi = false;

        if (ozgardimi){
            System.out.println("Narx ozgardi: " + milk);
        }else {
            System.out.println("Narx ozgarmadi: " + milk);
        }

    }

    static int heyCal(int a, int b){
        return  a + b;
    }

    static int heyCal(int a){
        return  a + 5;
    }
}
