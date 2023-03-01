package com.assigenement.day_3.employee_wage_using_object;

public class EmpWages {
  public static final int IS_FULL_TIME = 1;
  public static final int IS_PART_TIME = 2;
  public static final int WAGE_PER_HOUR = 20;
    int empHrs = 0;
    public static void main(String[] args) {
        System.out.println("Welcome to Employee  Wage Computation :");
        EmpWages empWages = new EmpWages();
        empWages.checkDailyEmpWage();
        empWages.dailyWage();
    }

    public void checkDailyEmpWage() {

        double empCheck = (int) Math.floor(Math.random() * 10) % 3;
        switch ((int) empCheck) {
            case IS_PART_TIME:
                empHrs = 4;
                System.out.println("Employee Present Half time :");
                break;
            case IS_FULL_TIME:
                empHrs = 8;
                System.out.println("Employee Present Full time :");
                break;
            default:
                empHrs = 0;
                System.out.println("Employee Absent :");
        }

    }

    public void dailyWage() {
        int dailyWage = (empHrs * WAGE_PER_HOUR);
        System.out.println("Daily wage for employee : "+dailyWage+ "$");
    }
}