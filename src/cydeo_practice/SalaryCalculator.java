package cydeo_practice;

public class SalaryCalculator {
    public static void main(String[] args) {

        System.out.println(salary(45, 40));
    }

    static double salary(double hourlyH, int weekH){

//        int numberOfWeeksInYear = 52;
//
//        double salary = hourlyH * weekH * numberOfWeeksInYear;
//
//        return salary;

        return hourlyH * weekH * 52;
    }
}
