package com.blz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayrollService {
    public static final Scanner SC = new Scanner(System.in);
    private List<EmployeePayrollData> employeeList;

    public EmployeePayrollService() {
        this.employeeList = new ArrayList<EmployeePayrollData>(); // created arraylist
    }

    public EmployeePayrollService(List<EmployeePayrollData> employeeList) {
        this.employeeList = employeeList;
    }

    public void readEmployeeData() {
        System.out.println("Enter employee id:");
        int employeeId = SC.nextInt();
        System.out.println("Enter employee name:");
        SC.nextLine();
        String employeeName = SC.nextLine();
        System.out.println("Enter employee salary:");
        double employeeSalary = SC.nextDouble();
        EmployeePayrollData newEmployee = new EmployeePayrollData(employeeId, employeeName, employeeSalary);
        employeeList.add(newEmployee);
    }

    public void writeEmployeeDate() {
        for (EmployeePayrollData o : employeeList)
            System.out.println(o.toString());
    }

    public static void main(String[] args) {
        EmployeePayrollService serviceObject = new EmployeePayrollService();
        serviceObject.readEmployeeData();
        serviceObject.writeEmployeeDate();
    }

}
