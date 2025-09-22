package com.itschool.session13.homework.ex1CollegeManagementSystem;

import java.time.Year;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CollegeManagementSystem college = new CollegeManagementSystem();

        Professor professor1 = new Professor();
        professor1.firstName= "Ema";
        professor1.lastName="Georgescu";
        professor1.sex='F';
        professor1.age=38;
        professor1.dateOfBirth = Year.now().getValue()-professor1.age;
        professor1.CNP="2234567891123";

        Professor professor2 = new Professor();
        professor2.firstName= "Emil";
        professor2.lastName="Popescu";
        professor2.sex='M';
        professor2.age=55;
        professor2.dateOfBirth = Year.now().getValue()-professor2.age;
        professor2.CNP="1234567891123";

        college.professors.add(professor1);
        college.professors.add(professor2);

        Student student1 = new Student();
        student1.firstName="Horia";
        student1.lastName="Pop";
        student1.sex='M';
        student1.age=18;
        student1.dateOfBirth=Year.now().getValue()-student1.age;
        student1.CNP="1775543671212";

        Student student2 = new Student();
        student2.firstName="Maria";
        student2.lastName="Mihai";
        student2.sex='F';
        student2.age=19;
        student2.dateOfBirth=Year.now().getValue()-student2.age;
        student2.CNP="2775543671333";

        college.students.add(student1);
        college.students.add(student2);

        Courses courses1 = new Courses();
        ArrayList<String> typeOfCourse = new ArrayList<>(List.of("Math", "Computer Science", "Physics",
                "Chemistry", "Biology", "Geography", "English", "History"));
        courses1.description=typeOfCourse.get(0);
        courses1.schedule= "Friday";
        courses1.assignedProfessor=professor1;

        Courses courses2 = new Courses();
        courses2.description=typeOfCourse.get(2);
        courses2.schedule="Tuesday";
        courses2.assignedProfessor=professor2;

        college.courses.add(courses1);
        college.courses.add(courses2);

        System.out.println("Courses and assigned professors are: ");
        for (Courses course : college.courses){
            System.out.println(course);
        }
        /*for (Student student : college.students){
            System.out.println(student);
        }*/
    }
}
