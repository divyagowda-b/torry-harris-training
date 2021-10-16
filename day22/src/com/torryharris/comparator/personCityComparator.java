package com.torryharris.comparator;

import com.torryharris.model.person;

import java.util.Comparator;

public class personCityComparator implements Comparator<person> {
    @Override
    public int compare(person o1, person o2) {
        return o1.getCity().compareTo(o2.getCity());
    }
}
