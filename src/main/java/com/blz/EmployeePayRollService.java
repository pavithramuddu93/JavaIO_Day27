package com.blz;
import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchEvent.Kind;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.nio.file.attribute.BasicFileAttributes;

public class EmployeePayrollService {
    /**
     * Java Enums can be thought of as classes which have a fixed set of constants
     * (a variable that does not change) we can define an enum either inside the
     * class or outside the class
     *
     * @author user -shard
     *
     */
    public enum IOService {
        CONSOLE_IO, FILE_IO, DB_IO, REST_IO
    }

    /**
     * creating List of EmployeePayrollData
     */
    private List<EmployeePayrollData> employeePayrollList;

    /**
     * creating constructor of EmployeePayrollService() which is default type
     */
    public EmployeePayrollService() {
    }

    /**
     * creating parameterized constructor of EmployeePayrollService with no return
     * type
     *
     * @param employeePayrollList -passing parameter
     */
    public EmployeePayrollService(List<EmployeePayrollData> employeePayrollList) {
        this.employeePayrollList = employeePayrollList;
    }

    /**
     * Main method for manipulation Of JavaFILE_IO
     *
     * @param args - Default Java param (Not used)
     */
    public static void main(String[] args) {
        /**
         * creating List of Type EmployeePayrollData using ArrayList to store all the
         * employeePayrolldata
         */
        List<EmployeePayrollData> employeePayrollList = new ArrayList<EmployeePayrollData>();

        /**
         * creating instance of EmployeePayrollData class
         */
        EmployeePayrollService employeePayrollService = new EmployeePayrollService(employeePayrollList);

        /**
         * using scanner to read input from console
         */
        Scanner consoleInputReader = new Scanner(System.in);

        /**
         * Calling method readEmployeeData to read data from console
         */
        employeePayrollService.readEmployeeData(consoleInputReader);

        /**
         * Calling method writeEmployeePayrollData to write the data
         */
        employeePayrollService.writeEmployeeData();
    }

    /**
     * @param consoleInputReader Read employee data
     */
    private void readEmployeeData(Scanner consoleInputReader) {
        System.out.println("Enter employee ID : ");
        int id = Integer.parseInt(consoleInputReader.nextLine());
        System.out.println("Enter employee name : ");
        String name = consoleInputReader.nextLine();
        System.out.println("Enter employee salary : ");
        double salary = Double.parseDouble(consoleInputReader.nextLine());

        /**
         * Adding EmployeePayrollData to the employeepayrollList
         */
        employeePayrollList.add(new EmployeePayrollData(id, name, salary));
    }

    /**
     * created method writeEmployeeData which writes the data of the employee in the
     * console
     */
    private void writeEmployeeData() {
        System.out.println("Writing Employee Payroll Data to Console\n" + employeePayrollList);
    }
}