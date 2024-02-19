package cydeo_practice;

public class Employee {

    private String name;

    private int age;

    private char gender;

    private String jobTitle;

    private double salary;

    public Employee(){
    }

    public Employee(String name, int age, char gender, String jobTitle, double salary){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public void work(){
        System.out.println(jobTitle + " " + name + " is working.");

        System.out.println(jobTitle + " " + name + "'s monthly salary is " + salary +  " $");
    }
}
