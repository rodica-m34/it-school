package com.itschool.session15.homework.Challenge2.hierarchicalInheritance;

public class FishingBoat extends Boat{
    private int fishCapacity;
    private String typeOfNet;

    public FishingBoat(int length, int weight, int fishCapacity, String typeOfNet) {
        super(length, weight);
        this.fishCapacity = fishCapacity;
        this.typeOfNet = typeOfNet;
    }

    public void castNet (){
        System.out.println("Net was casted");
    }

    @Override
    public void sail() {
        System.out.println("Fishing Boat is sailing");;
    }

    @Override
    public String toString() {
        return "FishingBoat{" +
                "length=" + length +
                ", weight=" + weight +
                ", fishCapacity=" + fishCapacity +
                ", typeOfNet='" + typeOfNet + '\'' +
                '}';
    }
}
