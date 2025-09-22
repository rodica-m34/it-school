package com.itschool.session13.homework.ex4FitnessTrackingSystem;

public class Workout {
    String typeOfWorkout;
    int resultWorkout;
    
    public String measureUnitWorkout (){
        switch (typeOfWorkout.toLowerCase()){
            case "running" -> {
                return "km";
            }
            case "lifting weights"->{
                return "kg";
            }
            case "aerobic" ->{
                return "min";
            }
        }
        return "Wrong workout type";
    }

    @Override
    public String toString() {
        return "typeOfWorkout='" + typeOfWorkout + '\'' +
                ", resultWorkout=" + resultWorkout +
                " " + measureUnitWorkout();
    }
}
