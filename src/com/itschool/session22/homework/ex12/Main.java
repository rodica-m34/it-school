package com.itschool.session22.homework.ex12;

public class Main {
    public static void main(String[] args) {
        DayScheduler [] scheduler = DayScheduler.values();
        for (DayScheduler day : scheduler){
            System.out.println(day + ": " + day.getActivities());
        }
    }
}
