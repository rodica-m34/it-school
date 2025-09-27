package com.itschool.session15.homework.Challenge2.multiLevelInheritance;

public class Tesla extends ElectricCar{
    private double autopilotVersion;

    public Tesla(String make, String model, int year, double batteryCapacity, int range, double autopilotVersion) {
        super(make, model, year, batteryCapacity, range);
        this.autopilotVersion=autopilotVersion;
    }

    public void enableAutopilot(){
        System.out.println("Autopilot was enabled");
    }

    @Override
    public String toString() {
        return "Tesla{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", batteryCapacity=" + batteryCapacity +
                ", range=" + range +
                ", autopilotVersion=" + autopilotVersion +
                '}';
    }
}
