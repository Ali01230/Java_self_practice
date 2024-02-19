package Practices.encapsulation;

public class AndroidDeveloperController {
    public static void main(String[] args) {


        AndroidDeveloper androidDeveloper = new AndroidDeveloper(
                2,
                "Poland",
                "Uzbekistan",
                "kotlin, Java",
                10.000);

        androidDeveloper.setExperiance(3);
        System.out.println(androidDeveloper.getExperiance());

        androidDeveloper.setWorkplace("France");
        System.out.println(androidDeveloper.getSalary());

        androidDeveloper.setCountry("Germany");
        System.out.println(androidDeveloper.getCountry());

        androidDeveloper.setProgrammingLanguages("Swift, Java");
        System.out.println(androidDeveloper.getProgrammingLanguages());

        androidDeveloper.setSalary(20.000);
        System.out.println(androidDeveloper.getSalary());

    }
}
