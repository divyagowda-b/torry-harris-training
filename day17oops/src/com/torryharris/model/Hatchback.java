package com.torryharris.model;

public class Hatchback extends car {
    String steeringType;

    public Hatchback(String steeringType) {
        this.steeringType = steeringType;
    }

    public Hatchback(String name, String fuelType, int engineCapacity, float power,
                     int noOfGears, Tyre tyre, String steeringType) {
        super(name, fuelType, engineCapacity, power, noOfGears, tyre);
        this.steeringType = steeringType;
    }

    public String getSteeringType() {
        return steeringType;
    }

    public void setSteeringType(String steeringType) {
        this.steeringType = steeringType;
    }

    public void displayHatchbackFeatures() {
        displayFeatures();
        System.out.println("steeringType is:"+steeringType);
        
    }

    private void displayFeatures() {
    }
}
