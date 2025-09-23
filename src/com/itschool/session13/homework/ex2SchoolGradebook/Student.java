package com.itschool.session13.homework.ex2SchoolGradebook;

import java.util.ArrayList;

public class Student {
    String name;
    int ID;
    ArrayList<Assignment> assignments = new ArrayList<>();
    double averageGrade=0.0;

    public void setAverageGrade (){
        double sum=0.0;
        for (Assignment elem: assignments){
            sum+=elem.grade;
        }
        averageGrade = sum /assignments.size();
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
