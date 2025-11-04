package com.itschool.session22.homework.ex6;

public class Main {
    public static void main(String[] args) {
        LightColor lightColor1 = LightColor.RED;
        System.out.println(lightColor1 + " " + lightColor1.getMessage()+" "+ lightColor1.getSeconds());

        LightColor lightColor2 = LightColor.YELLOW;
        System.out.println(lightColor2 + " " + lightColor2.getMessage()+" "+ lightColor2.getSeconds());

        LightColor lightColor3 = LightColor.GREEN;
        System.out.println(lightColor3 + " " + lightColor3.getMessage()+" "+ lightColor3.getSeconds());
    }
}
