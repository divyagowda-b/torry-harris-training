package com.torryharris.comparator;

import com.torryharris.model.car;

import java.util.Comparator;

public class carpowerComparator implements Comparator<car> {
    @Override
    public int compare(car o1, car o2) {
        return Float.compare(o2.getPower(),o1.getPower());
    }
}
