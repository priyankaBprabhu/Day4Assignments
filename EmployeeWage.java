package com.BridgelLabs;


public class EmployeeWage {
    public static void main(String[] args) {
        DailyEmployeeWage wage = new DailyEmployeeWage();
        int working_hours = 0;
        int total_working_hrs = 100;
        int total_working_days = 20;
        int pworking_hours =0;
        int fworking_hours = 0;
        int working_days = 0;
        int wage_per_hour = 20;
        System.out.println("Welcome to Employee Wage Computation Program ");
        while ((working_hours <= total_working_hrs) && (working_days <= total_working_days)) {
            System.out.println("working_days" + " " + working_days);
            int employee = (int) ((Math.random() * 10) % 3);
            switch (employee) {
                case 0: {
                    working_hours = working_hours + 8;
                    System.out.println("working hours" + " " + working_hours );
                    fworking_hours = fworking_hours +8;
                    System.out.println(" full time employee working hours" + " " + fworking_hours );
                    int fulltimeempwage = wage.fulltimeWage(wage_per_hour, fworking_hours);
                    System.out.println("full time employee  wage" + " " + fulltimeempwage);
                    break;
                }
                case 1: {
                    working_hours = working_hours + 4;
                    pworking_hours = pworking_hours +4;
                    System.out.println("working hours" + " " + working_hours );
                    System.out.println(" part time employee working hours" + " " + pworking_hours );
                    int parttimeempwage = wage.parttimeWage(wage_per_hour, pworking_hours);
                    System.out.println("part time employee  wage" + " " + parttimeempwage);
                    break;
                }
                case 2: {
                    System.out.println("Non is working " );
                    break;
                }
            }
            working_days++;
        }
    }
}