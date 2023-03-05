package com.assigenement.day_3.employee_wage_using_object;

public class EmpWageMultipleCompanies {
    public static void main(String[] args) {
        System.out.println("Welcome to Emp Wage Program :");
        EmpWagesMain[] empWagesMains = new EmpWagesMain[2];
        for (int i = 0; i < empWagesMains.length; i++) {
            empWagesMains[i] = new EmpWagesMain("TCS", 10, 20, 50);
            empWagesMains[i].totalWage();
        }
    }
}
