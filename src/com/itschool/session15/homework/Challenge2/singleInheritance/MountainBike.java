package com.itschool.session15.homework.Challenge2.singleInheritance;

public class MountainBike extends Bicycle{
    private String tireType;
    private String suspension;

    public MountainBike(String brandName, int speed, int gear, String tireType, String suspension) {
        super(brandName, speed, gear);
        this.tireType = tireType;
        this.suspension = suspension;
    }

    public void adjustSuspension(){
        System.out.println("Suspension was adjusted");
    }

    @Override
    public String toString() {
        return "MountainBike{" +
                "brandName='" + brandName + '\'' +
                ", speed=" + speed +
                ", gear=" + gear +
                ", tireType='" + tireType + '\'' +
                ", suspension='" + suspension + '\'' +
                '}';
    }
}
