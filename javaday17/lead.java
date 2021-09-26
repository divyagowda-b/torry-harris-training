package com.torryharris.model;

public class lead {
    private int teamSize;

    public lead(int teamSize) {
        this.teamSize = teamSize;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }
    public void standUpcall()
    {
        System.out.println("lead calling for stand up call....");
    }
    @override
    public String toString(){
        return "lead{" +super.toString()+
                 "teamsize=" +teamSize +
                  '}';
    }
}
