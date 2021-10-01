package com.company;

public class Employee_Wage_Computation_Problem {
    //constants
    public static final int IS_FULL_TIME = 1;
    public static final int EMP_RATE_PER_HOUR = 20;
    public static final int PER_DAY_WORK_HOUR = 8;


    public static void main(String[] args) {
        int empPerDayIncome = 0;
        System.out.println("Welcome to Employee Wage Computation Problem");

        double empCheck = Math.floor(Math.random() * 10 % 2);
        if (empCheck == IS_FULL_TIME) {
            System.out.println("Employee is Present");
            empPerDayIncome = EMP_RATE_PER_HOUR * PER_DAY_WORK_HOUR;
            System.out.println("Employee per day Income :- " + empPerDayIncome + " rs");
        } else
            System.out.println("Employee is Absent");
    }
}
