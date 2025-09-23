package com.itschool.session13.homework.ex1CollegeManagementSystem;

import java.util.ArrayList;

public class Course {

    String description;
    String schedule;
    Professor assignedProfessor = new Professor();
    ArrayList<Student> assignedStudents = new ArrayList<>();

    @Override
    public String toString() {
        return "Course{" +
                "description='" + description + '\'' +
                ", schedule='" + schedule + '\'' +
                ", assignedProfessor=" + assignedProfessor +
                ", assignedStudents=" + assignedStudents +
                '}';
    }
}
