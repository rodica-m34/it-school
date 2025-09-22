package com.itschool.session13.homework.ex1CollegeManagementSystem;

public class Courses {

    String description;
    String schedule;
    Professor assignedProfessor = new Professor();

    @Override
    public String toString() {
        return "Courses: " +
                "description='" + description + '\'' +
                ", schedule='" + schedule + '\'' +
                ", assignedProfessor=" + assignedProfessor +
                '}';
    }
}
