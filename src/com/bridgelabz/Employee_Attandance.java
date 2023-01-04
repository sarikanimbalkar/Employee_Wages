package com.bridgelabz;

public class Employee_Attandance {
    static final int WAGES_PER_HOUR = 20;
    static final int PART_TIME_HOUR = 8;

    static final int FULL_DAY_HOUR = 8;

    public static void main(String[] args) {
        int num = (int) (Math.random() * 10) % 2;
        int dailyWages = 0;
        int partTimeWages = 0;
        if (num == 1) {
            dailyWages = WAGES_PER_HOUR * FULL_DAY_HOUR;
            partTimeWages = (WAGES_PER_HOUR * PART_TIME_HOUR) / 2;//for part time employee daily wages calculated..
            System.out.println("Employee is Present...");
        } else {
            System.out.println("Employee is not Present...");
        }
        System.out.println("Employee Dayily Wages : " + dailyWages);
        System.out.println("Employee is Part Time so Dayily Wages is : " + partTimeWages);
    }
}
