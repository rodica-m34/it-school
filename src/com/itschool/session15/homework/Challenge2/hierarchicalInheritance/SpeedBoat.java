package com.itschool.session15.homework.Challenge2.hierarchicalInheritance;

public class SpeedBoat extends Boat {
    private int maxSpeed;
    private String engineType;

    public SpeedBoat(int length, int weight, int maxSpeed, String engineType) {
        super(length, weight);
        this.maxSpeed=maxSpeed;
        this.engineType=engineType;
    }

    public void turboBoost(){
        System.out.println("Turbo Boost is activated");
    }

    @Override
    public void sail() {
        System.out.println("Speed Boat is sailing");
    }

    @Override
    public String toString() {
        return "SpeedBoat{" +
                "length=" + length +
                ", weight=" + weight +
                ", maxSpeed=" + maxSpeed +
                ", engineType='" + engineType + '\'' +
                '}';
    }
}
