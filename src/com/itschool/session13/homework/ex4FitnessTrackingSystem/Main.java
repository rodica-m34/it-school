package com.itschool.session13.homework.ex4FitnessTrackingSystem;

public class Main {
    public static void main(String[] args) {
        User user1 = new User();
        user1.firstName="Jerry";
        user1.lastName="Seinfeld";
        user1.age=50;

        Workout workout1 = new Workout();
        workout1.typeOfWorkout="running";
        workout1.resultWorkout=2;
        user1.workouts.add(workout1);
        user1.setFitnessGoals(5,workout1);

        Workout workout2 = new Workout();
        workout2.typeOfWorkout="aerobic";
        workout2.resultWorkout=20;
        user1.workouts.add(workout2);
        user1.setFitnessGoals(20, workout2);

        System.out.println(user1);
    }
}
