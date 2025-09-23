package com.itschool.session13.homework.ex2SchoolGradebook;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ClassStudents class1 = new ClassStudents();
        class1.name = "XIIB";

        List<String> assignmentList = List.of("Engleza", "Matematica", "Fizica", "Chimie", "Economie");

        Student student1 = new Student();
        student1.name = "Ionescu Maria";
        student1.ID = 123;

        Assignment assignment1 = new Assignment();
        assignment1.description = assignmentList.get(2);
        assignment1.grade = 7;
        student1.assignments.add(assignment1);

        Assignment assignment2 = new Assignment();
        assignment2.description = assignmentList.get(3);
        assignment2.grade = 9;
        student1.assignments.add(assignment2);

        student1.setAverageGrade();

        Student student2 = new Student();
        student2.name = "Pop Mihai";
        student2.ID = 551;
        Assignment assignment3 = new Assignment();
        assignment3.description = assignmentList.get(0);
        assignment3.grade = 8;
        student2.assignments.add(assignment3);

        student2.setAverageGrade();

        Student student3 = new Student();
        student3.name = "Voinicu Fanel";
        student3.ID = 342;
        Assignment assignment4 = new Assignment();
        assignment4.description = assignmentList.get(1);
        assignment4.grade = 7;
        Assignment assignment5 = new Assignment();
        assignment5.description = assignmentList.get(4);
        assignment5.grade = 10;
        student3.assignments.add(assignment4);
        student3.assignments.add(assignment5);

        student3.setAverageGrade();

        class1.students.add(student1);
        class1.students.add(student2);
        class1.students.add(student3);

        System.out.println("Students in class " + class1.name + " are: ");
        for (Student student : class1.students) {
            System.out.println(student);
        }
    }
}
