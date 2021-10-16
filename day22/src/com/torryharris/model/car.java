package com.torryharris.model;

public class car {
    private int chassisno;
    private String name;
    private String fueltype;
    private float power;

    public car() {
    }

    public car(int chassisno, String name, String fueltype, float power) {
        this.chassisno = chassisno;
        this.name = name;
        this.fueltype = fueltype;
        this.power = power;
    }

    public int getChassisno() {
        return chassisno;
    }

    public void setChassisno(int chassisno) {
        this.chassisno = chassisno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFueltype() {
        return fueltype;
    }

    public void setFueltype(String fueltype) {
        this.fueltype = fueltype;
    }

    public float getPower() {
        return power;
    }

    public void setPower(float power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "car{" +
                "chassisno=" + chassisno +
                ", name='" + name + '\'' +
                ", fueltype='" + fueltype + '\'' +
                ", power=" + power +
                '}';
    }


}
