package Practices.encapsulation;

public class IOSdeveloper {

    private int experiance;
    private String workplace;
    private String country;
    private String programmingLanguage;
    private double salary;

    public IOSdeveloper(int experiance, String workplace, String country, String programmingLanguage, double salary) {
        this.experiance = experiance;
        this.workplace = workplace;
        this.country = country;
        this.programmingLanguage = programmingLanguage;
        this.salary = salary;
    }

    public int getExperiance() {
        return experiance;
    }

    public void setExperiance(int experiance) {
        this.experiance = experiance;
    }

    public String getWorkplace() {
        return workplace;
    }

    public void setWorkplace(String workplace) {
        this.workplace = workplace;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    void Test(){



    }
}
