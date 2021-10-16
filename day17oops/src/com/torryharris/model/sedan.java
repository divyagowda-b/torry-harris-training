package com.torryharris.model;

public class sedan extends car{
    int bootspace;

    public sedan(int bootspace) {
        this.bootspace = bootspace;
    }

    public sedan(String name, String fuelType, int engineCapacity, float power, int noOfGears,
                 Tyre tyre, int bootspace) {
        super(name, fuelType, engineCapacity, power, noOfGears, tyre);
        this.bootspace = bootspace;

    }

    public int getBootspace() {
        return bootspace;
    }

    public void setBootspace(int bootspace) {
        this.bootspace = bootspace;
    }
    public void displaysedanFeatures(){
        displayFeatures();
        System.out.println("bootspace is:"+bootspace);
    }

    private void displayFeatures() {
    }
}
