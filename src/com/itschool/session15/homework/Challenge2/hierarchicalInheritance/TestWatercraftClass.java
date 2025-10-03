package com.itschool.session15.homework.Challenge2.hierarchicalInheritance;

public class TestWatercraftClass {
    public static void main(String[] args) {
        Boat boat = new Boat(5, 2);
        boat.sail();
        System.out.println(boat);
        System.out.println("--------------");

        SpeedBoat speedBoat = new SpeedBoat(4, 2, 20, "jet drive");
        speedBoat.sail();
        speedBoat.turboBoost();
        System.out.println(speedBoat);
        System.out.println("----------------");

        FishingBoat  fishingBoat = new FishingBoat(5, 3, 20, "trap net");
        fishingBoat.sail();
        fishingBoat.castNet();
        System.out.println(fishingBoat);

    }

}
