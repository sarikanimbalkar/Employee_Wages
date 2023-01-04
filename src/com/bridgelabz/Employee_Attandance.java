package com.bridgelabz;

public class Employee_Attandance {
    static final int WAGES_PER_HOUR = 20;
    static final int FULL_DAY_PER_HOUR = 8;

    public static void main(String[] args) {
        int num = (int) (Math.random() * 10) % 2;
        int dailyWages=0;
        if (num == 1) {
            dailyWages=WAGES_PER_HOUR*FULL_DAY_PER_HOUR;
            System.out.println("Employee is Present...");
        } else
            System.out.println("Employee is not Present...");
        System.out.println("Employees Dayily Wages : " + dailyWages);
    }
}
