package com.itschool.session15.homework.Challenge2.multiLevelInheritance;

public class Car {
    protected String make;
    protected String model;
    protected int year;

    public Car (String make, String model, int year){
        this.make=make;
        this.model=model;
        this.year=year;
    }

    public void start(){
        System.out.println("Car started");
    }

    public void stop(){
        System.out.println("Car stopped");
    }

    public void accelerate(){
        System.out.println("Car accelerated");
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}
