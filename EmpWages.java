package com.assigenement.day_3.employee_wage_using_object;

public class EmpWages {
  public static final int IS_FULL_TIME = 1;
  public static final int IS_PART_TIME = 2;
  public static final int WAGE_PER_HOUR = 20;
  public static int MAX_DAY_PER_MONTH = 20;

  public static int MAX_HRS_IN_A_MONTH = 100;
    int wageForMonth = 0;

    public static void main(String[] args) {
        System.out.println("Welcome to Employee  Wage Computation :");
        EmpWages empWages = new EmpWages();
        System.out.println("Wage for Month : "+empWages.totalWage(empWages.wageForMonth));

    }

    public int totalWage(int wageForMonth) {
        int numberOfWorkingDays = 0;
        int totalWorkingHrs = 0;
        int empHrs = 0;
        int dailyWage = 0;


        while (numberOfWorkingDays < MAX_DAY_PER_MONTH && totalWorkingHrs < MAX_HRS_IN_A_MONTH) {
            numberOfWorkingDays++;

            double empCheck = Math.floor(Math.random() * 10) % 3;
            switch ((int) empCheck) {
                case IS_FULL_TIME:
                    empHrs = 8;
                    System.out.println("Employee is Present Full time : ");
                    break;
                case IS_PART_TIME:
                    empHrs = 4;
                    System.out.println("Employee is Present Half time : ");
                    break;
                default:
                    empHrs = 0;
                    System.out.println("Employee is Absent : ");
                    break;
            }

            dailyWage = (empHrs * WAGE_PER_HOUR);
            totalWorkingHrs = (empHrs + totalWorkingHrs);
            System.out.println("Daily wage for employee : " + dailyWage + "$");
            wageForMonth = dailyWage + wageForMonth;
        }
        return wageForMonth;



    }


}