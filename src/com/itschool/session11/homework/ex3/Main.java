package com.itschool.session11.homework.ex3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
      /*  3. Create
        2 empty ArrayLists: studentList and graduateStudentList
        populate studentList with 10 students
        copy values from studentList to graduateStudentList
        iterate through graduateStudentList and print each graduated student*/
        ArrayList <String> studentList = new ArrayList<>();
        ArrayList <String> graduateStudentList = new ArrayList<>();

        String [] names = {"Mihai Ionescu", "Virgil Pop", "Maria Pop", "Mihai Dumitru", "Alex Popescu", "Mia Zamfirescu",
        "Marta Maria", "Ioana Ionescu", "Alex Alexandrescu", "Jerry Seinfeld"};
        studentList.addAll(Arrays.asList(names));
        System.out.print("Student List: ");
        System.out.println(studentList);

        graduateStudentList.addAll(studentList);
        System.out.print("Graduate Student List: ");
        for (String graduateStudent : graduateStudentList)
        {
            System.out.print(graduateStudent+ ", ");
        }

    }
}
