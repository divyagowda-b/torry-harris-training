package com.torryharris.collection;

import com.torryharris.model.person;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class personHashSetDemo {
    public static void main(String[] args) {
        person p1 = new person(1001, "aish", "employee", "balkhi");
        person p2 = new person(1003, "shiv", "doctor", "balkhi");
        person p3 = new person(1005, "par", "business", "hyderabad");
        person p4 = new person(1002, "ram", "tourism", "goa");
        person p5 = new person(1006, "sita", "SE", "bengaluru");

        HashSet<person> pHashSet = new HashSet<>();
        pHashSet.add(p1);
        pHashSet.add(p2);
        pHashSet.add(p3);
        pHashSet.add(p4);
        pHashSet.add(p5);

        for (person person : pHashSet) {
            System.out.println(person);
        }
    }
}
