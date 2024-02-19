package Practices.encapsulation;

public class FrontEndController {

    public static void main(String[] args) {

        FrontEndDeveloper frontEndDeveloper = new FrontEndDeveloper(2,"London","Kyrgyzystan","Java skript",10.000d);

        frontEndDeveloper.setExperiance(4);
        System.out.println(frontEndDeveloper.getExperiance());


        frontEndDeveloper.setCountry("Usa");
        System.out.println(frontEndDeveloper.getCountry());


        frontEndDeveloper.setWorkplace("Dubai");
        System.out.println(frontEndDeveloper.getWorkplace());

        frontEndDeveloper.setSalary(19.000);
        System.out.println(frontEndDeveloper.getSalary());


        frontEndDeveloper.setProgrammingLanguage("Pyton");
        System.out.println(frontEndDeveloper.getProgrammingLanguage());
    }
}
