package com.assigenement.day_3.employee_wage_using_object;

import java.util.Random;

public class EmpWagesMain {
    static final int IS_Full_TIME = 1;
    static final int IS_PART_TIME = 2;


    String companyName;
    int WAGE_PER_HOUR;
    int MAX_WORKING_DAYS;
    int MAX_WORKING_HOURS;

    static int empHrs;
    static int wageForMonth;
    static int total_Working_Hours;
    int total_Working_Days;

    public EmpWagesMain(String companyName, int WAGE_PER_HOUR, int MAX_WORKING_DAYS, int MAX_WORKING_HOURS) {
        this.companyName = companyName;
        this.WAGE_PER_HOUR = WAGE_PER_HOUR;
        this.MAX_WORKING_DAYS = MAX_WORKING_DAYS;
        this.MAX_WORKING_HOURS = MAX_WORKING_HOURS;

    }


    public void totalWage() {
        for (int i = 1; i <= MAX_WORKING_DAYS; i++) {
            if (total_Working_Days < MAX_WORKING_DAYS && total_Working_Hours < MAX_WORKING_HOURS) {
                empCheck();

                int dailyWage = empHrs * WAGE_PER_HOUR;
                System.out.println("Daily Wage = " + dailyWage);
                total_Working_Days++;
                System.out.println("Total working Hours : " + total_Working_Hours + " for day : " + i);
                wageForMonth = wageForMonth + dailyWage;
                System.out.println();
            }
        }
        System.out.println("The company name " + companyName + " has Total Wage for the month is: " + wageForMonth + " Total working days are: "
                + total_Working_Days + " Total working hours are: " + total_Working_Hours);
    }

    public void empCheck() {
        Random random = new Random();
        int isPresent = random.nextInt(3);

        switch (isPresent) {
            case IS_Full_TIME: {
                if (total_Working_Hours + 8 <= MAX_WORKING_HOURS) {
                    System.out.println("Employee is present Full time");
                    empHrs = 8;
                    // calculating total working hours
                    total_Working_Hours = total_Working_Hours + empHrs;
                }
            }
            break;
            case IS_PART_TIME: {
                if (total_Working_Hours + 8 <= MAX_WORKING_HOURS) {
                    System.out.println("Employee is present Part time");
                    empHrs = 4;
                    total_Working_Hours = total_Working_Hours + empHrs;
                }
            }
            break;
            default:
                System.out.println("Employee is Absent");
                empHrs = 0;
                break;
        }
    }

    @Override
    public String toString() {
        return "Employee_Wage_Program's Company Name is: " + companyName + " and it's wage for the month is: " + wageForMonth;
    }


}