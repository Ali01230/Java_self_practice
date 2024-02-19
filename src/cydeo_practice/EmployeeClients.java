package cydeo_practice;

public class EmployeeClients {

    public static void main(String[] args) {
        Employee emp1 = new Employee();
        Employee emp2 = new Employee("Ali",23,'M',"Tester",30.000d);
        emp2.work();

        System.out.println();
    }
}
