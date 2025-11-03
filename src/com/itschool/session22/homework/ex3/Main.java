package com.itschool.session22.homework.ex3;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Student> studentSet = new HashSet<>();
        Student student1 = new Student("Popescu Mimi", 20, 2803, "popescu_mimi@gmail.com");
        Student student2 = new Student("Popescu Mimi", 20, 2801, "popescu_mimi@gmail.com");
        studentSet.add(student1);
        studentSet.add(student2);
        System.out.println(student1.equals(student2));
        System.out.println(student1.hashCode()==student2.hashCode());
    }
}
