package m46_error_exception_handling;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Usage {
    public static void main(String[] args) throws InterruptedException, FileNotFoundException, InvalidNameException {

        Person person = new Person();

        person.setName("");
        System.out.println(person.getName() + " :name");

        person.setAge(56);
        System.out.println(person.getAge() + " :age");


//        System.out.println(
//                9 / 0           // Arithmetic exception
//
//        );

//        String hello = null;
//        System.out.println(hello.toUpperCase());  // NullPointer exception

        int a = 6;
        String s = String.valueOf(a);
        boolean g = s instanceof String;
        System.out.println(g);

//        String num = "100g";
//        int i = Integer.parseInt(num);
//        boolean f = Integer.valueOf(i) instanceof Integer;   // NumberFormat exception
//        System.out.println(f);


//        ArrayList<Integer> numbers1 = new ArrayList<>();
//
//        numbers1.add(1);
//        numbers1.add(2);
//        numbers1.add(3);                               // IndexOutOfBounds exception
//        numbers1.add(4);
//
//        System.out.println(numbers1.get(5));


//        int[] numbers = {1,2,3,4,5,6,7,8,9,10};        //ArrayIndexOutOfBounds  exception
//        System.out.println(numbers[10]);


//        String str = "Muhammadali";                   // StringIndexOutOfBounds exception
//        System.out.println(str.charAt(13));


//        Animal animal = new Animal("Bear");         // ClassCast exception
//        Lion lion = (Lion) animal;


//        throw new IllegalArgumentException("Illegal Argument");     //IllegalArgument exception





            Thread.sleep(5000);


    }

    static void A() throws FileNotFoundException {
        throw new FileNotFoundException();
    }

    static void B() throws FileNotFoundException {
        A();
    }

    static void C() throws FileNotFoundException {
        B();
    }

    static void D(){
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    static void G(){
        D();
        try {
            C();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    static void F() throws FileNotFoundException {
        C();
    }


}
