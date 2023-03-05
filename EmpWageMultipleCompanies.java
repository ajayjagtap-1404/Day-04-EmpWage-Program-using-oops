package com.assigenement.day_3.employee_wage_using_object;

public class EmpWageMultipleCompanies {
    public static void main(String[] args) {
        System.out.println("Welcome to Emp Wage Program :");
        EmpWagesMain empWages = new EmpWagesMain("TCS",10,20,50);
        empWages.totalWage();
        EmpWagesMain empWages1 = new EmpWagesMain("DMart",20,25,60);
        empWages1.totalWage();

    }
}
