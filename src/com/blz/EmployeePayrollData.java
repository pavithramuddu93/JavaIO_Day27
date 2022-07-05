package com.blz;

public class EmployeePayrollData {
    /*
     * variables
     */

    public int id;
    public String name;
    public double salary;

    /**
     * parametric counstructor
     *
     * @param id-emplyee            id
     * @param name-employee-name
     * @param salary-employeeSalary
     */
    public EmployeePayrollData(int id, String name, double salary) {
        super();
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    /**
     * to display
     */
    @Override
    public String toString() {
        return "EmployeePayrollData [id=" + id + ", name=" + name + ", salary=" + salary + "]";
    }

}
