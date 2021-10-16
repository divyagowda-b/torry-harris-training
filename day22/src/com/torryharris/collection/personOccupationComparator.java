package com.torryharris.collection;

import com.torryharris.model.person;

import java.util.Comparator;

public class personOccupationComparator implements Comparator<person> {
    @Override
    public int compare(person o1, person o2) {
        return o1.getOccupation().compareTo(o2.getOccupation());
    }
}
