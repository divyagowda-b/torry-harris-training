package com.torryharris.model;

public class person implements Comparable<person> {
    private int aadharNo;
    private String name;
    private String state;
    private String occupation;

    public person(int aadharNo, String name, String state, String occupation) {
        this.aadharNo = aadharNo;
        this.name = name;
        this.state = state;
        this.occupation = occupation;
    }

    public int getAadharNo() {
        return aadharNo;
    }

    public void setAadharNo(int aadharNo) {
        this.aadharNo = aadharNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    @Override
    public String toString() {
        return "person{" +
                "aadharNo=" + aadharNo +
                ", name='" + name + '\'' +
                ", state='" + state + '\'' +
                ", occupation='" + occupation + '\'' +
                '}';
    }

    @Override
    public int compareTo(person o) {
        return this.aadharNo-o.aadharNo;
    }
}
