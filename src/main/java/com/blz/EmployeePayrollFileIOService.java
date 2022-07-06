package com.blz;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class EmployeePayrollFileIOService {

    /**
     * Text file created in Payroll_file_name variable
     */
    public static String PAYROLL_FILE_NAME = "src/payroll-file.txt";

    /**
     * method created to write tha data of EmployeePayroll from the list
     *
     * @param employeePayrollList
     */
    public void writeData(List<EmployeePayrollData> employeePayrollList) {
        StringBuffer empBuffer = new StringBuffer();

        /**
         * for each method is taken this the terminal operation
         */
        employeePayrollList.forEach(employee -> {
            String employeeDataString = employee.toString().concat("\n");
            empBuffer.append(employeeDataString);
        });

        /**
         * try catch block is taken to handle the exception.In try block if path will
         * get it enters to try block otherwise ioexception will occur
         */
        try {
            Files.write(Paths.get(PAYROLL_FILE_NAME), empBuffer.toString().getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * created method printData to print the employee payroll data Using FileIO
     * prints lines in the payroll file
     */
    public void printData() {
        try {
            Files.lines(new File(PAYROLL_FILE_NAME).toPath()).forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * method created to count the number of entries given data type as lonh
     *
     * @return -return to method created
     */
    public long countEntries() {
        long entries = 0;
        try {
            entries = Files.lines(new File(PAYROLL_FILE_NAME).toPath()).count();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return entries;
    }
}