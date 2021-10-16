package com.torryharris.model;

public class music {
    public static String issoundwoofer;
    private static String name;
    private static int noOfSpeakers;
    private static int lcdScreenSize;
    private boolean subWoofer;

    public music(String name, int noOfSpeakers, boolean subWoofer, int lcdScreenSize) {
        this.name = name;
        this.noOfSpeakers = noOfSpeakers;
        this.subWoofer = subWoofer;
        this.lcdScreenSize = lcdScreenSize;
    }

    public static String getname() {
        return name;
    }

    public static int getNoOfSpeakers() {
        return noOfSpeakers;
    }

    public boolean isSubWoofer() {
        return subWoofer;
    }

    public static int getLcdScreenSize() {
        return lcdScreenSize;
    }
}
