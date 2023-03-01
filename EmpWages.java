package com.assigenement.day_3.employee_wage_using_object;

public class EmpWages {
    int IS_FULL_TIME = 1;
    int IS_PART_TIME = 2;
    int WAGE_PER_HOUR = 20;
    int emHrs = 0;
    public static void main(String[] args) {
        System.out.println("Welcome to Employee  Wage Computation :");
        EmpWages empWages = new EmpWages();
        empWages.checkDailyEmpWage();
        empWages.dailyWage();
    }

    public void checkDailyEmpWage() {

        double empCheck = Math.floor(Math.random() * 10) % 3;

        if (empCheck == IS_FULL_TIME) {

            System.out.println("Employee is Present Full time : ");
            emHrs = 8;

        } else if (empCheck == IS_PART_TIME){
            System.out.println("Employee is Present Half time : ");
            emHrs = 4;

        } else {
            System.out.println("Employee is Absent : ");
            emHrs = 0;
        }

    }

    public void dailyWage() {
        int dailyWage = (emHrs * WAGE_PER_HOUR);
        System.out.println("Daily wage for employee : "+dailyWage+ "$");
    }
}