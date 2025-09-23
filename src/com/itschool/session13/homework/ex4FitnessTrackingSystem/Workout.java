
package com.itschool.session13.homework.ex4FitnessTrackingSystem;

public class Workout {
    String typeOfWorkout;
    int resultWorkout;

    public String measureUnitWorkout() {

        return switch (typeOfWorkout.toLowerCase()) {
            case "running" -> "km";
            case "lifting weights" -> "kg";
            case "aerobic" -> "min";
            default -> "Wrong workout type";
        };
    }

    @Override
    public String toString() {
        return "typeOfWorkout='" + typeOfWorkout + '\'' +
                ", resultWorkout=" + resultWorkout +
                " " + measureUnitWorkout();
    }
}
