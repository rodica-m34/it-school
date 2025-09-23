package com.itschool.session13.homework.ex4FitnessTrackingSystem;

import java.util.ArrayList;

public class User {
    String firstName;
    String lastName;
    int age;
    ArrayList<Workout> workouts = new ArrayList<>();
    ArrayList<String> goals = new ArrayList<>();

    public void setFitnessGoals(int workoutGoal, Workout workout){
        if (workoutGoal==workout.resultWorkout){
            goals.add(workout + " goal of " + workoutGoal +" "+workout.measureUnitWorkout() + " is achieved");
        }
        else {
            goals.add(workout+ " goal of " + workoutGoal + " "+workout.measureUnitWorkout() + " is not achieved");
        }
    }

    @Override
    public String toString() {
        return "User: " +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age + "\n"+
                "workouts=" + workouts + "\n"+
                "goals=" + goals +
                '}';
    }
}
