package com.itschool.session13.homework.ex2SchoolGradebook;

import java.util.ArrayList;

public class Student {
    String name;
    int ID;
    ArrayList<Assignement> assignments = new ArrayList<>();
    double averageGrade=0.0;

    public void setAverageGrade (){
        int sum=0;
        for (Assignement elem: assignments){
            sum+=elem.grade;
        }
        averageGrade = (double) sum /assignments.size();
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", ID=" + ID +
                ", assignments=" + assignments +
                ", averageGrade=" + averageGrade +
                '}';
    }
}
