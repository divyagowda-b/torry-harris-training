package com.torryharris.driver;

import com.torryharris.model.employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class ArraylistDemo {

    public static void main(String[] args) {
        ArrayList<String> StringArrayList = new ArrayList();
        StringArrayList.add("torry");
        StringArrayList.add("harris");
        System.out.println(StringArrayList);


        ArrayList<Float> fArrayList = new ArrayList();
        fArrayList.add(2.2f);
        fArrayList.add(4.5f);
        System.out.println(fArrayList);


        employee e1 = new employee(122, "divya", "manager", 5000000);
        employee e2 = new employee(123, "aish", "HR", 500000);
        employee e3 = new employee(121, "raksh", "SSE", 520000);


        ArrayList<employee> employeeListArrayList = new ArrayList<>();
        employeeListArrayList.add(e1);
        employeeListArrayList.add(e2);
        employeeListArrayList.add(e3);
        //System.out.println(empListArrayList);
        //for (int i = 0; i < StringArrayList.size(); i++) {
            //System.out.println(StringArrayList.get(i));

            Iterator<employee> employeeIterator = employeeListArrayList.iterator();
            while (employeeIterator.hasNext())
            System.out.println(employeeIterator.next());
            System.out.println();

        System.out.println("after sorting ascending order");
        employeeListArrayList.sort(null);
        Iterator<employee> employeeIterator2 = employeeListArrayList.iterator();
        while (employeeIterator2.hasNext())
        System.out.println(employeeIterator2.next());
        System.out.println();

        System.out.println("after sorting in descending order");
        employeeListArrayList.sort(Collections.reverseOrder());
        Iterator<employee> employeeIterator1 = employeeListArrayList.iterator();
        while (employeeIterator1.hasNext())
            System.out.println(employeeIterator1.next());
        System.out.println();



    }
    }





