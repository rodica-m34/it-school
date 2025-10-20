package com.itschool.session20.recapitulare.ex4;

public class EmployeeUpdateStatus {
    private final Employee employee;

    public EmployeeUpdateStatus(Employee employee) {
        this.employee = employee;
    }

    public void calculateAnnualSalary (){
        int annualSalary = employee.getSalary() * 12;
        System.out.println(annualSalary);
    }

    public void setSalaryRaise (int amount){
        System.out.println("The employee has received a raise in amount of " + amount);
        int newSalary = employee.getSalary()+amount;
        employee.setSalary(newSalary);
    }

    public void displayEmployeeInformation (){
        System.out.println("===============");
        System.out.println("Name: "+employee.getName());
        System.out.println("Id: "+employee.getId());
        System.out.println("Salary: "+employee.getSalary());
        System.out.println("Job Title: "+employee.getJobTitle());
        System.out.println("===============");
    }
}
