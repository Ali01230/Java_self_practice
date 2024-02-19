package m38_oop_part1_constructor;

public class StaticInitializer {

    static int age;

    static{
        age = 10;
    }

    static{
        age = 15;
    }

    static{
        age = 25;
        System.out.println("Now My Tests will start !!!!" + age);
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Test is starting....");
        Thread.sleep(5000);

        System.out.println("Test finished");
    }


}
