package com.itschool.session11.homework.ex6;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //6. Given a LinkedList storing student names, write a program that checks
        //if a particular student name exists in the list. If it does, remove that name from the list.
        ArrayList <String> studentList = new ArrayList<>(List.of("Ionescu Mia", "Pop Emil", "Zamfir Monica", "Marinescu Ion", "Bontea Sorin"));
        String student = "Pop Emil";
        if (studentList.contains("Pop Emil"))
        {
            studentList.remove(student);
        }
        System.out.println(studentList);
    }
}
