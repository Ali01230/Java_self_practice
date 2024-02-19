package Practices.encapsulation;

public class QAtester {

    protected int experiance;
    protected String country;
    protected String workplace;
    protected String programmingLanguage;

    protected double salary;

    protected QAtester(int experiance, String country, String workplace, String programmingLanguage, double salary) {

        this.experiance = experiance;
        this.country = country;
        this.workplace = workplace;
        this.programmingLanguage = programmingLanguage;
        this.salary = salary;

    }
}
