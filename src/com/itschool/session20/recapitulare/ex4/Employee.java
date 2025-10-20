package com.itschool.session20.recapitulare.ex4;

public class Employee {
    private String name;
    private int id;
    private int salary;
    private String jobTitle;

    public Employee(String name, int id, int salary, String jobTitle) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getSalary() {
        return salary;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
