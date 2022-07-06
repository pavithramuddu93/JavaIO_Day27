package blz;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import com.blz.EmployeePayrollData;
import com.blz.EmployeePayrollService;
import org.junit.Test;

import employeePlayRollService.EmployeePayrollService.IOService;

public class EmployeePayrollServiceTest {

    @Test
    /**
     * method is created to find the number of entries given3Employees here When
     * Written To File Should Match the EmployeeEntries
     */
    public void given3Employees_WhenWrittenToFile_ShouldMatchEmployeeEntries() {

        /**
         * created the array of employee Payroll data to store the entries
         */
        EmployeePayrollData[] arrayOfEmp = { new EmployeePayrollData(1, "Jeff Bezos", 100000.0),
                new EmployeePayrollData(2, "Bill Gates", 200000.0),
                new EmployeePayrollData(3, "Mark Zuckerberg", 300000.0) };
        EmployeePayrollService employeePayrollService;
        employeePayrollService = new EmployeePayrollService(Arrays.asList(arrayOfEmp));

        /**
         * calling the method writeEmployeeData from the IO_File
         */
        employeePayrollService.writeEmployeeData(IOService.FILE_IO);

        /**
         * calling the method countEntries from the IO_File
         */
        long entries = employeePayrollService.countEntries(IOService.FILE_IO);
        employeePayrollService.printData(IOService.FILE_IO);
        assertEquals(3, entries);
    }
}