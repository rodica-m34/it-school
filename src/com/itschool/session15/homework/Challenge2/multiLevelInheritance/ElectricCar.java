package com.itschool.session15.homework.Challenge2.multiLevelInheritance;

public class ElectricCar extends Car{
    protected double batteryCapacity;
    protected int range;

    public ElectricCar(String make, String model, int year,double batteryCapacity, int range) {
        super(make, model, year);
        this.batteryCapacity=batteryCapacity;
        this.range=range;
    }

    public void charge (){
        System.out.println("Electric car is charging");
    }

    @Override
    public void start() {
        System.out.println("Electric car started");;
    }

    @Override
    public void stop() {
        System.out.println("Electric car stopped");;
    }

    @Override
    public void accelerate() {
        System.out.println("Electric car accelerated");;
    }

    @Override
    public String toString() {
        return "ElectricCar{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", batteryCapacity=" + batteryCapacity +
                ", range=" + range +
                '}';
    }
}
