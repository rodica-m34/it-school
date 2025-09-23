package com.itschool.session13.homework.ex1CollegeManagementSystem;

public class Student {
    String firstName;
    String lastName;
    char sex;
    int age;
    int dateOfBirth;
    String CNP;

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
