package com.itschool.session15.homework.Challenge2.hierarchicalInheritance;

public class Boat {
    protected int length;
    protected int weight;

    public Boat(int length, int weight) {
        this.length = length;
        this.weight = weight;
    }

    public void sail (){
        System.out.println("Boat is sailing");
    }

    @Override
    public String toString() {
        return "Boat{" +
                "length=" + length +
                ", weight=" + weight +
                '}';
    }
}
