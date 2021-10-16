package com.torryharris.collection;

import com.torryharris.comparator.personCityComparator;
import com.torryharris.model.person;

import java.util.TreeSet;

public class personTreeSetDemo {
    public static void main(String[] args) {
        person p1 = new person(1001, "aish", "employee", "balkhi");
        person p2 = new person(1003, "shiv", "doctor", "balkhi");
        person p3 = new person(1005, "par", "business", "hyderabad");
        person p4 = new person(1002, "ram", "tourism", "goa");
        person p5 = new person(1006, "sita", "SE", "bengaluru");

        TreeSet<person> people = new TreeSet<>();
        people.add(p1);
        people.add(p2);
        people.add(p3);
        people.add(p4);
        people.add(p5);

        for (person person : people) {
            System.out.println(person);
        }
        System.out.println("by city");
        TreeSet<person> treeSetByCity = new TreeSet<>(new personCityComparator());
        treeSetByCity.add(p1);
        treeSetByCity.add(p2);
        treeSetByCity.add(p3);
        treeSetByCity.add(p4);
        treeSetByCity.add(p5);

        for (person person : treeSetByCity) {
            System.out.println(person);
        }
        System.out.println("by occupation");
        TreeSet<person> treeSetByoccupation = new TreeSet<>(new personOccupationComparator());
        treeSetByoccupation.add(p1);
        treeSetByoccupation.add(p2);
        treeSetByoccupation.add(p3);
        treeSetByoccupation.add(p4);
        treeSetByoccupation.add(p5);

        for (person person : treeSetByoccupation) {
            System.out.println(person);
        }



    }
}
