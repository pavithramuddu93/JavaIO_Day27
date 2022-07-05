package com.blz;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeePayRollService {

    static ArrayList<EmployeePayrollData> employeePayrollList = new ArrayList<EmployeePayrollData>();

    public static void main(String[] args) {
        /**
         * Created an object of Scanner class to read console input reader
         */
        Scanner consoleInputReader = new Scanner(System.in);

        /**
         * Passed the Scanner class object to the method of reading user input
         */
        EmployeePayRollService.readEmployeePayRollData(consoleInputReader);
        EmployeePayRollService.writeEmployeePayRollData();
    }

    // user input method in the console
    private static void readEmployeePayRollData(Scanner consoleInputReader) {
        System.out.println("Enter Employee ID: ");
        int id = consoleInputReader.nextInt();
        System.out.println("Enter Employee Name: ");
        String name = consoleInputReader.next();
        System.out.println("Enter Employee Salary");
        double salary = consoleInputReader.nextDouble();
        // Adding details to the array list
        employeePayrollList.add(new EmployeePayrollData(id, name, salary));

    }

    /**
     * Method to print the list
     */
    private static void writeEmployeePayRollData() {
        System.out.println("\nWriting Employee Payroll Roaster to Console\n" + employeePayrollList);
    }
}