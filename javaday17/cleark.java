package com.torryharris.model;

public class cleark {
    private String degree;

    public cleark(String degree) {
        this.degree = degree;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }
    public void generalpayroll(){
        System.out.println("general payroll");
    }
    @override
    public String toString(){
        return "cleark{"+super.toString()+
               ",degree='"+degree +degree+'\''+
                '}';
    }
}
