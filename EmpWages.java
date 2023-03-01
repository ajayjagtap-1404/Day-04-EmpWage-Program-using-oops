package com.assigenement.day_3.employee_wage_using_object;

public class EmpWages {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee  Wage Computation :");
        EmpWages empWages = new EmpWages();
        empWages.employeeAttendance();
    }

    public void employeeAttendance() {
        int IS_FULL_TIME = 1;
        double empCheck = Math.floor(Math.random() * 10) % 2;
        if (empCheck == IS_FULL_TIME) {
            System.out.println(+empCheck);
            System.out.println("Employee is Present");

        } else {
            System.out.println(+empCheck);
            System.out.println("Employee is Absent");
        }

    }
}