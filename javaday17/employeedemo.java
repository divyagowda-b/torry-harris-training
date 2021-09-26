package com.torryharris.driver;

import com.torryharris.model.cleark;
import com.torryharris.model.employee;
import com.torryharris.model.lead;
import com.torryharris.model.manager;

public class employeedemo {


    public static void main(String[] args){
        employee e1=new employee("divya",1001,"CEO",1000000);
        employee e2=new employee("Archana",1002,"manager",50000);
        employee e3=new employee("gopi",1003,"salesman",80000);
        employee e4=new employee("vani",1004,"Cleark",500000);
        employee e5=new employee("Rakshi",1005,"HR",500000);
        manager m1=new manager("divya",1001,"CEO",120000000,"Alpha",5);

        System.out.println(m1.toString());
    }
}
