package com.itschool.session20.recapitulare.ex4;

public class Main {
    public static void main(String[] args) {
        //Employee: Create an Employee class that has the following attributes: name, id, salary, and job title.
        // Implement methods for calculating the employee's annual salary, giving the employee a raise,
        // and displaying the employee's information
        Employee employee1 = new Employee("Popescu Gogu", 232, 3000, "Analist Bancar");
        EmployeeUpdateStatus employeeUpdateStatus = new EmployeeUpdateStatus(employee1);
        employeeUpdateStatus.calculateAnnualSalary();
        employeeUpdateStatus.setSalaryRaise(2000);
        employeeUpdateStatus.displayEmployeeInformation();
    }
}
