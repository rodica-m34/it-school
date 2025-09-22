package com.itschool.session13.homework.ex2SchoolGradebook;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ClassStudents class1 = new ClassStudents();
        class1.name="XIIB";

        ArrayList<String> assignementList = new ArrayList<>(List.of("Engleza","Matematica","Fizica","Chimie","Economie"));

        Student student1 = new Student();
        student1.name="Ionescu Maria";
        student1.ID=123;
        Assignement assignement1 = new Assignement();
        assignement1.description=assignementList.get(2);
        assignement1.grade=7;
        student1.assignments.add(assignement1);
        Assignement assignement2 = new Assignement();
        assignement2.description=assignementList.get(3);
        assignement2.grade=9;
        student1.assignments.add(assignement2);
        student1.setAverageGrade();

        Student student2 = new Student();
        student2.name="Pop Mihai";
        student2.ID=551;
        Assignement assignement3 = new Assignement();
        assignement3.description=assignementList.get(0);
        assignement3.grade=8;
        student2.assignments.add(assignement3);
        student2.setAverageGrade();

        Student student3 = new Student();
        student3.name="Voinicu Fanel";
        student3.ID=342;
        Assignement assignement4 = new Assignement();
        assignement4.description=assignementList.get(1);
        assignement4.grade=7;
        Assignement assignement5 = new Assignement();
        assignement5.description=assignementList.get(4);
        assignement5.grade=10;
        student3.assignments.add(assignement4);
        student3.assignments.add(assignement5);
        student3.setAverageGrade();

        class1.students.add(student1);
        class1.students.add(student2);
        class1.students.add(student3);

        System.out.println("Students in class " + class1.name + " are: ");
        for (Student student : class1.students)
        {
            System.out.println(student);
        }
    }

}
