package com.torryharris.driver;

import com.torryharris.model.person;

import java.util.ArrayList;
import java.util.Iterator;

public class persondemo {
    public static void main(String[] args) {
        person p1 = new person(1234,"divya","karnataka","employee");
        person p2 = new person(1233,"aish","karnataka","employee");
        person p3 = new person(1235,"rash","karnataka","employee");
        ArrayList<person> pArrayList= new ArrayList<>();
        pArrayList.add(p1);
        pArrayList.add(p2);
        pArrayList.add((p3));
        Iterator<person> personIterator= pArrayList.iterator();
        while ( personIterator.hasNext())
        System.out.println( personIterator.next());

        System.out.println("after sorting persons by adharno");
        pArrayList.sort(null);
        Iterator<person> personIterator1= pArrayList.iterator();
        while ( personIterator1.hasNext())
        System.out.println( personIterator1.next());





    }
}
