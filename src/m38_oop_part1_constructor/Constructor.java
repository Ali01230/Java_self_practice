package m38_oop_part1_constructor;

public class Constructor {

    public Constructor(){
        System.out.println("Object is created by using no-arg constructor");

    }
    public Constructor(int a){
        System.out.println("Object is created by using the parametrized constructor");

    }
    public static void main(String[] args) {

          Constructor obj = new Constructor();

          Constructor obj2 = new Constructor(10);

    }
}
