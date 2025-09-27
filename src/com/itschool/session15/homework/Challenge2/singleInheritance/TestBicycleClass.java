package com.itschool.session15.homework.Challenge2.singleInheritance;

public class TestBicycleClass {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle("Cannondale", 15, 2);
        System.out.println(bicycle);
        bicycle.changeGear();
        bicycle.speedUp();
        System.out.println("------------------");
        MountainBike mountainBike = new MountainBike("Trek", 20, 3,"tubular", "air suspension");
        System.out.println(mountainBike);
        mountainBike.changeGear();
        mountainBike.speedUp();
        mountainBike.adjustSuspension();
    }
}
