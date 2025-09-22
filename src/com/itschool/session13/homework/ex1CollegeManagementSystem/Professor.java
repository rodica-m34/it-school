package com.itschool.session13.homework.ex1CollegeManagementSystem;

public class Professor {
    String firstName, lastName, address;
    char sex;
    int age, dateOfBirth;
    String CNP;

    @Override
    public String toString() {
        return "firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + '}';
    }
}