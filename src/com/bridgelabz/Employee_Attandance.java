package com.bridgelabz;

public class Employee_Attandance {
    public static void main(String[] args) {
       int num=(int) (Math.random()*10) %2;
        System.out.println(num);
       if (num==1)
       {
           System.out.println("Employee is Present...");
       }
       else
           System.out.println("Employee is not Present...");

    }
}
