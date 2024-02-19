package Practices.encapsulation;

public class AndroidDeveloper {
    private int experiance;
    private String workplace;
    private String country;
    private String programmingLanguages;
    private double salary;

    public AndroidDeveloper(int experiance, String workplace, String country, String programmingLanguages, double salary) {
        this.experiance = experiance;
        this.workplace = workplace;
        this.country = country;
        this.programmingLanguages = programmingLanguages;
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

    public String getProgrammingLanguages() {
        return programmingLanguages;
    }

    public void setProgrammingLanguages(String programmingLanguages) {
        this.programmingLanguages = programmingLanguages;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
