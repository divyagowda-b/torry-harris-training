package com.torryharris.model;

public class Tyre{
    private String tyrename;
    private int size;

    public Tyre(String tyrename, int size) {
        this.tyrename = tyrename;
        this.size = size;
    }

    public String getTyrename() {
        return tyrename;
    }

    public int getSize() {
        return size;
    }
    public void setsize(int size){
        this.size=size;
    }



}