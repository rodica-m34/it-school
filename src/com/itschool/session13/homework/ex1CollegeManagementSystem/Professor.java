package com.itschool.session13.homework.ex1CollegeManagementSystem;

public class Professor {
    String firstName;
    String lastName;
    String CNP;
    char sex;
    int age;
    int dateOfBirth;

    @Override
    public String toString() {
        return "firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + '}';
    }
}