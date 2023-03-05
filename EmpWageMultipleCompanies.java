package com.assigenement.day_3.employee_wage_using_object;

public class EmpWageMultipleCompanies {
    public static void main(String[] args) {
        System.out.println("Welcome to Emp Wage Program :");
        EmpWagesMain tcs = new EmpWagesMain("TCS",10,20,50);
        tcs.totalWage();
        System.out.println(tcs);
        System.out.println();
        EmpWagesMain dMart = new EmpWagesMain("DMart",20,25,60);
        dMart.totalWage();
        System.out.println(dMart);

    }
}
