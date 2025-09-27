package com.itschool.session15.homework.Challenge2.singleInheritance;

public class Bicycle {
    String brandName;
    protected int speed;
    protected int gear;

    public Bicycle(String brandName, int speed, int gear) {
        this.brandName=brandName;
        this.speed = speed;
        this.gear = gear;
    }

    public void changeGear(){
        System.out.println("Gear was changed");
    }

    public void speedUp (){
        System.out.println("Speed increased");
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "brandName='" + brandName + '\'' +
                ", speed=" + speed +
                ", gear=" + gear +
                '}';
    }
}
