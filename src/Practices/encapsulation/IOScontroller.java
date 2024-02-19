package Practices.encapsulation;

public class IOScontroller {

    public static void main(String[] args) {


        IOSdeveloper iosdeveloper = new IOSdeveloper(2,"London","Kyrgyzystan","Java skript",10.000d);

        iosdeveloper.setExperiance(7);
        System.out.println(iosdeveloper.getExperiance());


        iosdeveloper.setCountry("BAA");
        System.out.println(iosdeveloper.getCountry());


        iosdeveloper.setWorkplace("Andijan");
        System.out.println(iosdeveloper.getWorkplace());

        iosdeveloper.setSalary(13.000);
        System.out.println(iosdeveloper.getSalary());


        iosdeveloper.setProgrammingLanguage("Swift");
        System.out.println(iosdeveloper.getProgrammingLanguage());

    }
}
