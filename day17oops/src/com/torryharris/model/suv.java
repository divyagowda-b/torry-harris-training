package com.torryharris.model;

public class suv extends car{
    String drivemode;
    Boolean sunroof;

    public suv(String drivemode, Boolean sunroof) {
        this.drivemode = drivemode;
        this.sunroof = sunroof;
    }

    public suv(String name, String fuelType, int engineCapacity, float power,
               int noOfGears, Tyre tyre, String drivemode, Boolean  sunroof) {
        super(name, fuelType, engineCapacity, power, noOfGears, tyre);
        this.drivemode = drivemode;
        this.sunroof = sunroof;
    }

    public String getDrivemode() {
        return drivemode;
    }

    public void setDrivemode(String drivemode) {
        this.drivemode = drivemode;
    }

    public Boolean getSunroof() {
        return sunroof;
    }

    public void setSunroof(Boolean sunroof) {
        this.sunroof = sunroof;
    }
    public void displaysuvFeatures(){
        
    }

    public void displaysedanFeatures() {
        displayFeatures();
        System.out.println("drivemode is:"+drivemode);
        System.out.println("sunroof is:"+sunroof);
    }

    private void displayFeatures() {
    }


}
