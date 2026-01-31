package Assessments.Assessment3_AmaraNyanzi.Problem4;

/**
 * Assessment 3: Mid-Term Practical Test
 * Student: Amara Nyanzi
 * Date: 31/01/2026
 * Problem:  Code Analysis & Debugging
 *
 * Problems Identified:
 * - Encapsulation violations
 * - Static context misuse
 * - Constructor problems
 * - Method return type issues
 * - Missing exception handling
 * - Code quality issues
 *
 * Solutions Implemented
 *
 *
 */
public class EmployeeManagement {
    public String companyName;
    String employeeName;
    double salary;

    public EmployeeManagement(String employeeName, String companyName, double salary)
    throws InvalidInputException {
        if(employeeName.isEmpty() || companyName.isEmpty() || salary < 0) {
            throw new InvalidInputException("InvalidInput! Fields cannot be null and salary cannot be negative");
        }

        this.employeeName = employeeName;
        this.companyName = companyName;
        this.salary = salary;
    }

    public String getCompanyName() {
        return companyName;
    }

    public double getSalary() {
        return salary;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setSalary(double salary) throws InvalidInputException {
        if (salary < 0) {
            throw new InvalidInputException("Salary cannot be negative");
        }
        this.salary = salary;
    }

    public double calculateBonus() {
        return salary * 1.1;
    }
}
