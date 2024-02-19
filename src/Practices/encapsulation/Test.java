package Practices.encapsulation;

public class Test extends QAtester implements Father, Mother{
    public Test(int experiance, String country, String workplace, String programmingLanguage, double salary) {
        super(experiance, country, workplace, programmingLanguage, salary);
    }

    @Override
    public void hi() {

    }

    @Override
    public void bye() {

    }

    void Test(){

        String country = super.country;


    }

    public static void main(String[] args) {
        QAtester qt = new QAtester(4,"4","4","4",4.0);

        String programmingLanguage1 = qt.programmingLanguage;
    }
}
