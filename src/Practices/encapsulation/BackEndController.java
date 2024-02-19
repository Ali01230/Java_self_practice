package Practices.encapsulation;

public class BackEndController {

    public static void main(String[] args) {

        BackendDeveloper backendDeveloper = new BackendDeveloper(2,"London","Kyrgyzystan","Java skript",10.000d);

        backendDeveloper.setExperiance(4);
        System.out.println(backendDeveloper.getExperiance());


        backendDeveloper.setCountry("Usa");
        System.out.println(backendDeveloper.getCountry());


        backendDeveloper.setWorkplace("Dubai");
        System.out.println(backendDeveloper.getWorkplace());

        backendDeveloper.setSalary(19.000);
        System.out.println(backendDeveloper.getSalary());


        backendDeveloper.setProgrammingLanguage("Pyton");
        System.out.println(backendDeveloper.getProgrammingLanguage());

    }
}
